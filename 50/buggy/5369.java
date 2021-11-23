private java.lang.String receiveMessage() throws java.io.IOException {
    utilities.IO.printlnDebug(this, "Waiting for input...");
    return in.readLine();
}