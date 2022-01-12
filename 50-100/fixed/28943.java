public void run() {
    while (isRunning) {
        try {
            java.net.Socket peersock = servsock.accept();
            java.lang.System.out.println("Client connected");
            Server.ServerPeer serverpeer = new Server.ServerPeer(peersock, this);
            serverpeers.add(serverpeer);
            java.lang.Thread serverpeerthread = new java.lang.Thread(serverpeer);
            serverpeerthread.start();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        if (!(isRunning)) {
            shutDown();
        }
    } 
}