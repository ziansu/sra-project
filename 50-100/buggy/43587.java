private void sendKillMessages(java.util.Set<java.lang.Integer> transactionsToBeKilled) {
    for (java.lang.Integer transaction : transactionsToBeKilled) {
        ch.epfl.tkvs.transactionmanager.communication.requests.AbortRequest abortRequest = new ch.epfl.tkvs.transactionmanager.communication.requests.AbortRequest(transaction);
        for (java.lang.Integer tm : ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.activeTransactions.keySet()) {
            if (ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.activeTransactions.get(tm).contains(transaction)) {
                try {
                    ch.epfl.tkvs.yarn.appmaster.AppMaster.sendMessageToTM(tm, abortRequest, true);
                } catch (java.io.IOException e) {
                    ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.log.error(("Cant send Abort " + e));
                }
            }
        }
    }
}