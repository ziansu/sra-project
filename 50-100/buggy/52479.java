public void init(java.lang.String registryHost, int registryPort) throws java.rmi.NotBoundException, java.rmi.RemoteException {
    vsue.rmi.VSAuctionEventHandler thisRemote = ((vsue.rmi.VSAuctionEventHandler) (java.rmi.server.UnicastRemoteObject.exportObject(this, THIS_REMOTE_PORT)));
    java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.getRegistry(registryHost, registryPort);
    auctionServer = ((vsue.rmi.VSAuctionService) (registry.lookup(VSAuctionRMIServer.REGISTRY_NAME)));
}