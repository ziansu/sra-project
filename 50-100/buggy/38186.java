private void sendFiles() {
    try {
        if ((net.ddns.akd.wincleaner.network.Connections.socketChannel) == null) {
            net.ddns.akd.wincleaner.network.Connections.setTCPServer();
        }
        socket = Connections.socketChannel.socket();
        for (net.ddns.akd.wincleaner.model.Datei f : this.fileData) {
            java.lang.System.out.println(("Send File " + (f.getName())));
            this.sendFile(f.getFile());
        }
        this.socket.close();
        java.lang.System.out.println("send complete!");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}