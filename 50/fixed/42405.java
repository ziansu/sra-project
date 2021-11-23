void connectClient(jaci.openrio.delegate.BoundDelegate delegate, java.net.Socket socket, java.io.OutputStream output) throws java.io.IOException {
    output.write("SUCCESS\n".getBytes());
    delegate.bindClient(socket);
}