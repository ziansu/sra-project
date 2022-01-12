private void connect(java.lang.String server, java.lang.Integer port) throws java.io.IOException {
    try {
        socket = new java.net.Socket(server, port);
        socket.setKeepAlive(true);
        in = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream(), "UTF-8"));
        out = new java.io.OutputStreamWriter(socket.getOutputStream(), "UTF-8");
    } catch (java.io.IOException e) {
        reconnect();
    }
}