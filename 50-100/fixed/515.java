public boolean renameFileOrDir(java.lang.String currentfolder, java.lang.String oldname, java.lang.String newname) {
    boolean renamed = false;
    try {
        if (!(client.isConnected()))
            login();
        
        client.rename(((currentfolder + "/") + oldname), ((currentfolder + "/") + newname));
        renamed = true;
    } catch (java.lang.Exception e) {
        renamed = false;
    }
    return renamed;
}