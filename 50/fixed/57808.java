public void connect(java.net.Socket socket) {
    connection = new Project.Connection(socket, this);
    new java.lang.Thread(connection).start();
}