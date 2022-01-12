private void createRegistry() {
    try {
        java.rmi.registry.LocateRegistry.createRegistry(ch.hsr.objectCaching.testFrameworkServer.Server.serverPort);
        ch.hsr.objectCaching.interfaces.ServerInterface skeleton = ((ch.hsr.objectCaching.interfaces.ServerInterface) (java.rmi.server.UnicastRemoteObject.exportObject(this, ch.hsr.objectCaching.testFrameworkServer.Server.serverPort)));
        java.rmi.registry.Registry reg = java.rmi.registry.LocateRegistry.getRegistry(ch.hsr.objectCaching.testFrameworkServer.Server.serverPort);
        reg.rebind("blupp", skeleton);
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
    }
}