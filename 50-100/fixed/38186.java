private void sendFiles() {
    if ((net.ddns.akd.wincleaner.network.Connections.socketChannel) == null) {
        net.ddns.akd.wincleaner.network.Connections.setTCPServer();
    }
    socket = Connections.socketChannel.socket();
    for (net.ddns.akd.wincleaner.model.Datei f : this.fileData) {
        java.lang.System.out.println(("Send File " + (f.getName())));
        this.sendFile(f.getFile());
    }
    java.lang.System.out.println("send complete!");
}