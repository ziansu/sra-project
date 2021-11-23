public void sendMessage(java.net.Socket socket, de.spiderlinker.cuc.network.Datapackage msg) throws java.io.IOException {
    if ((socket != null) && (msg != null)) {
        try {
            de.spiderlinker.cuc.network.utils.ConnectionUtils.performHandshake(socket);
            de.spiderlinker.cuc.network.utils.ConnectionUtils.writeObject(socket, msg);
        } catch (java.io.IOException e) {
            throw e;
        }
    }
}