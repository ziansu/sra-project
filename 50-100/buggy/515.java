public boolean renameFileOrDir(java.lang.String currentfolder, java.lang.String oldname, java.lang.String newname) throws java.io.IOException, java.net.SocketException {
    boolean renamed = false;
    try {
        if (!(client.isConnected()))
            login();
        
        renamed = client.rename(((currentfolder + "/") + oldname), ((currentfolder + "/") + newname));
    } catch (java.io.IOException e) {
        login();
        renameFileOrDir(currentfolder, oldname, newname);
    }
    return renamed;
}