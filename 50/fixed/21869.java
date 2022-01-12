private void getStream(java.net.Socket clientSocket) throws java.io.IOException {
    this.inputStream = new java.io.ObjectInputStream(clientSocket.getInputStream());
}