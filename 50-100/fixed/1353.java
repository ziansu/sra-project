@java.lang.Override
public nl.erwinvaneyk.communication.Server start(int port) throws nl.erwinvaneyk.communication.exceptions.PortAlreadyInUseException {
    try {
        registry = java.rmi.registry.LocateRegistry.createRegistry(port);
    } catch (java.rmi.RemoteException e) {
        try {
            java.lang.Thread.sleep(500);
            registry = java.rmi.registry.LocateRegistry.createRegistry(port);
        } catch (java.lang.InterruptedException | java.rmi.RemoteException e1) {
            throw new nl.erwinvaneyk.communication.exceptions.PortAlreadyInUseException("Failed to start RMI-registry (server).", e);
        }
    }
    return this;
}