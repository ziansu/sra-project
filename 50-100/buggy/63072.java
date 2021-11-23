public void kickOutClient(remote.Client c) throws java.rmi.RemoteException {
    if (clients.contains(c)) {
        clients.remove(c);
        username.remove(clients.indexOf(c));
        c.kickedOut();
        broadcast();
    }
}