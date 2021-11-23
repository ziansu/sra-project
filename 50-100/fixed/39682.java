private void agentCycle(int tries) {
    try {
        connect();
        tries = 0;
        sendCycle();
    } catch (java.io.IOException | io.riemann.riemann.client.UnsupportedJVMException e) {
        if (reconnect(tries)) {
            agentCycle((++tries));
        }
    }
}