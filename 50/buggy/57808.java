public void connect(java.net.Socket socket) {
    connection = new Project.Connection(socket, this);
}