public void connect() throws java.io.IOException {
    socket = server.accept();
    out = new java.io.ObjectOutputStream(socket.getOutputStream());
    in = new java.io.ObjectInputStream(socket.getInputStream());
}