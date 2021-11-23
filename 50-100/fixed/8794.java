public static void main(java.lang.String[] args) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.net.ServerSocket sconn = null;
    java.net.Socket conn = null;
    antsserverdigest.gestore now;
    java.lang.Thread thread;
    int port = 3356;
    sconn = new java.net.ServerSocket(port);
    while (true) {
        try {
            conn = sconn.accept();
            now = new antsserverdigest.gestore(conn);
            thread = new java.lang.Thread(now);
            thread.start();
        } catch (java.io.IOException e) {
        }
    } 
}