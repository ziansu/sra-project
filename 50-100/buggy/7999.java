public void start() {
    new java.lang.Thread(() -> {
        while (true) {
            final java.net.Socket socket;
            try {
                socket = accept();
            } catch (java.io.IOException ex) {
                ex.printStackTrace();
                return ;
            }
            new java.lang.Thread(() -> workWithSocket(socket)).start();
        } 
    }).start();
}