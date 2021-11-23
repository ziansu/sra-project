public void connect() throws java.io.IOException {
    socket = server.accept();
    in = new java.io.ObjectInputStream(socket.getInputStream());
    out = new java.io.ObjectOutputStream(socket.getOutputStream());
}