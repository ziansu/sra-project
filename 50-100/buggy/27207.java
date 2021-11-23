private static boolean waitUnsubscribeConfirm() {
    synchronized(arces.unibo.SEPA.client.tools.SEPATest.sync) {
        if (arces.unibo.SEPA.client.tools.SEPATest.unsubscriptionConfirmReceived)
            return true;
        
        try {
            arces.unibo.SEPA.client.tools.SEPATest.sync.wait(5000);
        } catch (java.lang.InterruptedException e) {
            arces.unibo.SEPA.client.tools.SEPATest.logger.debug(("InterruptedException: " + (e.getMessage())));
        }
    }
    return arces.unibo.SEPA.client.tools.SEPATest.unsubscriptionConfirmReceived;
}