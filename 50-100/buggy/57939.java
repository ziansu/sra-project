@java.lang.Override
public void run() {
    while (!(java.lang.Thread.interrupted())) {
        try {
            java.net.Socket clientSocket = serverSocket.accept();
            java.lang.Thread worker = new java.lang.Thread(new devhood.im.sim.service.PeerToPeerMessageServiceReceiver(clientSocket));
            worker.start();
        } catch (java.io.IOException e) {
            log.log(java.util.logging.Level.SEVERE, "client socket connection error");
        }
    } 
}