@java.lang.Override
public int ping(java.lang.String name) throws java.rmi.RemoteException {
    try {
        java.lang.String s = (("ping from " + name) + " ") + (java.rmi.server.RemoteServer.getClientHost());
        return 1;
    } catch (java.rmi.server.ServerNotActiveException e) {
        e.printStackTrace();
    }
    return 0;
}