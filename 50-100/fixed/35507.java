public static void tryConnect() throws java.rmi.NotBoundException, java.rmi.RemoteException {
    if ((java.lang.System.getSecurityManager()) == null) {
        java.lang.System.setSecurityManager(new java.lang.SecurityManager());
    }
    connection.RMIHelper.obj = new connection.RMIHelper();
    int port = java.lang.Integer.parseInt(connection.RMIHelper.strPort);
    java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.getRegistry(connection.RMIHelper.serverIP, port);
    java.rmi.Remote provider = registry.lookup(connection.RMIHelper.objectiveName);
    connection.RMIHelper.obj.provider = ((connection.RMIObjectProviderService) (provider));
    connection.RMIHelper.obj.connectStatus = true;
}