private boolean checkConnection(java.lang.String host, int port) {
    try {
        java.net.Socket socket = new java.net.Socket(host, port);
        java.io.PrintWriter out = new java.io.PrintWriter(socket.getOutputStream(), true);
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
        int data = in.read();
        socket.close();
        return data != (-1);
    } catch (java.io.IOException e) {
    }
    return false;
}