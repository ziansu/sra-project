private void connectToClient(java.net.ServerSocket serverSocket) {
    try (java.net.Socket client = serverSocket.accept();java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(client.getOutputStream());java.io.DataInputStream dataInputStream = new java.io.DataInputStream(client.getInputStream())) {
        dataOutputStream.writeUTF(TEST_MESSAGE);
        dataOutputStream.flush();
        java.lang.String input = dataInputStream.readUTF();
        org.testng.Assert.assertEquals(input, TEST_MESSAGE);
        client.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}