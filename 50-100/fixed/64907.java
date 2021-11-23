public boolean renameFile(java.lang.String from, java.lang.String to) {
    boolean renamed = false;
    try {
        if (!(client.isConnected()))
            login();
        
        client.rename(from, to);
        renamed = true;
    } catch (java.lang.Exception e) {
        renamed = false;
    }
    return renamed;
}