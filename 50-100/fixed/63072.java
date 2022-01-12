public void kickOutClient(remote.Client c) throws java.rmi.RemoteException {
    if (clients.contains(c)) {
        username.remove(clients.indexOf(c));
        clients.remove(c);
        c.kickedOut();
        broadcast();
    }
}