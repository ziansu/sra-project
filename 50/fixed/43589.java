private assignment_2.Server lookUpRemote() throws java.rmi.NotBoundException, java.rmi.RemoteException {
    java.rmi.registry.Registry registry = java.rmi.registry.LocateRegistry.getRegistry(assignment_2.HOST, assignment_2.PORT);
    return ((assignment_2.Server) (registry.lookup(assignment_2.RMI_ID)));
}