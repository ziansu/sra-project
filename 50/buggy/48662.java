public void terminateConnection() throws java.io.IOException {
    shouldKeepProcessing = false;
    toClient.writeBytes("-5");
}