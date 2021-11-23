public void connectionLost(java.lang.Throwable cause) {
    log((("Connection to " + (brokerUrl)) + " lost!"));
    java.lang.System.exit(1);
}