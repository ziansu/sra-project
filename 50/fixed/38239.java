@java.lang.Override
public void checkRegistration(java.lang.String selfAddress) throws java.rmi.RemoteException {
    if (!(registered.contains(selfAddress))) {
        registered.add(selfAddress);
        new org.zenframework.z8.server.engine.TransportService.Registrator(selfAddress).start();
    }
}