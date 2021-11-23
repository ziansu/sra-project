private static boolean waitNotification() {
    synchronized(arces.unibo.SEPA.client.tools.SEPATest.sync) {
        if (arces.unibo.SEPA.client.tools.SEPATest.notificationReceived)
            return true;
        
        try {
            arces.unibo.SEPA.client.tools.SEPATest.sync.wait(arces.unibo.SEPA.client.tools.SEPATest.subscribeConfirmDelay);
        } catch (java.lang.InterruptedException e) {
            arces.unibo.SEPA.client.tools.SEPATest.logger.info(e.getMessage());
        }
    }
    return arces.unibo.SEPA.client.tools.SEPATest.notificationReceived;
}