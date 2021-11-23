@java.lang.Override
public void run() {
    try {
        java.net.ServerSocket welcomeSocket = new java.net.ServerSocket(this.port);
        while (true) {
            java.lang.System.out.println("FEEDBACK SERVER started................");
            connectionSocket = welcomeSocket.accept();
            new org.wso2.carbon.sample.performance.feedbackServer.TCPSessionWriter(connectionSocket).start();
        } 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}