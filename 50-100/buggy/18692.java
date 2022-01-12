void close() {
    server.showMessage(new Message(("Closing connection with " + (server.users[((number) + 1)]))));
    try {
        inputStream.close();
        outputStream.close();
        socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    server.disconnected(number);
}