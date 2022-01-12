public void clientDisconnected(client.Client client) {
    java.util.List<client.Client> lostRouteClients;
    synchronized(syncRoot) {
        if (!(cache.contains(client))) {
            return ;
        }
        lostRouteClients = removeClient(client);
    }
    callbacks.onClientDisconnected(client);
    for (client.Client c : lostRouteClients) {
        callbacks.onClientLostRoute(c, c.getRoute());
    }
}