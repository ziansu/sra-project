@java.lang.Override
public synchronized void performDecision() {
    ch.epfl.tkvs.transactionmanager.lockingunit.DeadlockGraph mergedGraph = new ch.epfl.tkvs.transactionmanager.lockingunit.DeadlockGraph(ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.graphs.values());
    java.util.Set<java.lang.Integer> transactionsToBeKilled = mergedGraph.checkForCycles();
    ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.log.info("perform decision");
    for (java.lang.Integer tid : transactionsToBeKilled)
        ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.log.info(("Killing transaction" + tid));
    
    sendKillMessages(transactionsToBeKilled);
    ch.epfl.tkvs.yarn.appmaster.centralized_decision.DeadlockCentralizedDecider.graphs.clear();
}