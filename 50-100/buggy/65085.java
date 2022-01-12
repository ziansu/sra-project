private static boolean waitPing() {
    long delay = (arces.unibo.SEPA.client.tools.SEPATest.pingDelay) + ((arces.unibo.SEPA.client.tools.SEPATest.pingDelay) / 2);
    synchronized(arces.unibo.SEPA.client.tools.SEPATest.sync) {
        arces.unibo.SEPA.client.tools.SEPATest.pingReceived = false;
        try {
            arces.unibo.SEPA.client.tools.SEPATest.logger.debug((("Waiting ping in " + delay) + " ms..."));
            arces.unibo.SEPA.client.tools.SEPATest.sync.wait(delay);
        } catch (java.lang.InterruptedException e) {
            arces.unibo.SEPA.client.tools.SEPATest.logger.info(e.getMessage());
        }
    }
    return arces.unibo.SEPA.client.tools.SEPATest.pingReceived;
}