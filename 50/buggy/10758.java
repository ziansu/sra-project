public void closeConnection() throws java.io.IOException {
    out.writeObject(Client.END);
    in.close();
    out.close();
    socket.close();
}