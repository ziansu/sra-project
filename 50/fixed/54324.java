public void connectionLost(java.lang.Throwable cause) {
    log(((("Connection to " + (brokerUrl)) + " lost!") + cause));
    java.lang.System.exit(1);
}