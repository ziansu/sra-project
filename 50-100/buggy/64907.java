public boolean renameFile(java.lang.String from, java.lang.String to) throws java.io.IOException, java.net.SocketException {
    boolean renamed = false;
    try {
        if (!(client.isConnected()))
            login();
        
        renamed = client.rename(from, to);
    } catch (java.io.IOException e) {
        login();
        renameFile(from, to);
    }
    return renamed;
}