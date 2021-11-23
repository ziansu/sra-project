private void open() throws java.io.IOException {
    java.io.InputStream inputStream;
    inputStream = _socket.getInputStream();
    _in = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
    java.io.OutputStream outputStream = _socket.getOutputStream();
    _out = new java.io.PrintWriter(outputStream);
    _connected = true;
}