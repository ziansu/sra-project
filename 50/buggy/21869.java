private void getStream(java.net.Socket clientSocket) throws java.io.IOException {
    this.outputStream = new java.io.ObjectOutputStream(clientSocket.getOutputStream());
    this.inputStream = new java.io.ObjectInputStream(clientSocket.getInputStream());
}