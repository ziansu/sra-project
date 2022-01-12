public static void main(java.lang.String[] args) {
    ch.hsr.objectCaching.testFrameworkServer.Server myServer = new ch.hsr.objectCaching.testFrameworkServer.Server();
    try {
        java.rmi.registry.LocateRegistry.createRegistry(ch.hsr.objectCaching.testFrameworkServer.Server.serverPort);
        ch.hsr.objectCaching.interfaces.ServerInterface skeleton = ((ch.hsr.objectCaching.interfaces.ServerInterface) (java.rmi.server.UnicastRemoteObject.exportObject(myServer, ch.hsr.objectCaching.testFrameworkServer.Server.serverPort)));
        java.rmi.registry.Registry reg = java.rmi.registry.LocateRegistry.getRegistry();
        reg.rebind("blupp", skeleton);
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
    }
}