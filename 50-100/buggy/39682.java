private void agentCycle(int tries) {
    try {
        connect();
        tries = 0;
        sendCycle();
    } catch (java.io.IOException e) {
        if (reconnect(tries)) {
            agentCycle((++tries));
        }
    } catch (io.riemann.riemann.client.UnsupportedJVMException ex) {
        slf4jLogger.error(ex.getMessage());
        java.lang.System.exit(0);
    }
}