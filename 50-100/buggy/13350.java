public void checkForRemoteServer() {
    if (((serverAdmin) == null) && ((((currentDatabase) == null) || (!((currentDatabase.getStorage()) instanceof com.orientechnologies.orient.client.remote.OStorageRemoteThread))) || (currentDatabase.isClosed())))
        throw new com.orientechnologies.common.exception.OException("Remote server is not connected. Use 'connect remote:<host>[:<port>][/<database-name>]' to connect");
    
}