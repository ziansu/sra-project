private void startHttpServer() {
    java.lang.String text = "OK";
    int port = java.lang.Integer.parseInt(java.lang.System.getenv("VCAP_APP_PORT"));
    java.net.ServerSocket ss = new java.net.ServerSocket(port);
    while (true) {
        java.net.Socket s = ss.accept();
        s.getOutputStream().write(("HTTP/1.1 200 OK\nContent-Type: text/html; charset=utf-8\nContent-Length: 2\n\n" + text).getBytes());
    } 
}