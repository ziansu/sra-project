void close() throws java.io.IOException {
    byte[] bytes = getFtpResponse("200", "Disconected.");
    send(bytes);
    bytes = getFtpResponse("200", "Good bye.");
    send(bytes);
    mCommandSocket.close();
    mCommandSocket = null;
}