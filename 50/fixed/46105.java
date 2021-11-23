public void closeAll() {
    for (com.dmdirc.Server server : servers) {
        server.disconnect();
        server.close();
    }
}