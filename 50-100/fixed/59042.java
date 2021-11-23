@java.lang.Override
public void run() {
    java.net.ServerSocket ssocket;
    try {
        ssocket = new java.net.ServerSocket(10000);
        while (true) {
            java.lang.System.out.println("waiting for connection\n");
            java.net.Socket socket = ssocket.accept();
            tak.Client cc = new tak.Client(socket);
            cc.start();
        } 
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(tak.TakServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}