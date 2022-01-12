public void start() {
    new java.lang.Thread(() -> {
        while (true) {
            final java.net.Socket socket;
            try {
                socket = accept();
                new java.lang.Thread(() -> workWithSocket(socket)).start();
            } catch (java.io.IOException ex) {
                ex.printStackTrace();
                return ;
            }
        } 
    }).start();
}