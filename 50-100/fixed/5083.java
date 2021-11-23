public java.lang.Object readFromMasterServer() throws java.io.IOException, java.lang.ClassNotFoundException {
    if ((masterServerSocket) == null)
        connectToMasterServer();
    
    java.lang.Object result = null;
    try {
        result = masterServerInputStream.readObject();
    } catch (java.io.IOException ex) {
        connectToMasterServer();
        try {
            result = masterServerInputStream.readObject();
        } catch (java.io.IOException ex2) {
            java.util.logging.Logger.getLogger(Networking.Client.ConnectionHandler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex2);
            masterServerSocket = null;
            throw ex2;
        }
    }
    return result;
}