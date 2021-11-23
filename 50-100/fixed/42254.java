private void distributeXml(final org.unikn.quedix.socket.BaseXClient client, final java.lang.String name, final java.io.BufferedInputStream bis, final java.io.File file) throws java.io.IOException {
    if (checkCollectionExistence(client, name)) {
        client.execute(((org.unikn.quedix.socket.SocketClient.OPEN) + name));
    }else {
        client.createCol(name);
        mMeta.addDb(client.ehost, name);
    }
    client.add(file.getAbsolutePath(), bis);
}