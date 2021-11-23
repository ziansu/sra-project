public void serve() throws java.io.IOException {
    while (!(isStopped())) {
        java.net.Socket socket = null;
        try {
            socket = serverSocket.accept();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        new java.lang.Thread(new minesweeper.server.MinerRunnable(socket)).start();
    } 
}