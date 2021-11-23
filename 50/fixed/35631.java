private void releaseConnector(javax.management.remote.JMXConnector pConnector) throws java.io.IOException {
    if (pConnector != null) {
        pConnector.close();
    }
}