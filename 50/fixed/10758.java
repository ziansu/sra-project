public void closeConnection() throws java.io.IOException {
    out.writeObject(Client.END);
}