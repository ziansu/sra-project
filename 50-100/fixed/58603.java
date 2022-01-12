@java.lang.Override
public void run() {
    try {
        java.lang.System.out.println("FEEDBACK SERVER started................");
        java.net.ServerSocket welcomeSocket = new java.net.ServerSocket(this.port);
        while (true) {
            connectionSocket = welcomeSocket.accept();
            new org.wso2.carbon.sample.performance.feedbackServer.TCPSessionWriter(connectionSocket).start();
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}