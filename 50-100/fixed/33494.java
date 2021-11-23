public void startClient(java.net.InetAddress ip, java.io.File fileName, java.io.File outputValue) {
    try {
        Client c = new Client(ip, SharedTorrent.fromFile(fileName, outputValue));
        c.setMaxDownloadRate(0.0);
        c.setMaxUploadRate(0.0);
        c.share();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}