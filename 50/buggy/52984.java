protected void pause() throws java.io.IOException {
    outToServer.writeObject("pause");
}