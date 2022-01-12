public void notifyStateChange(eis.iilang.EnvironmentState newState) {
    java.util.Set<nl.tudelft.bw4t.network.BW4TClientActions> clientset = new java.util.HashSet<nl.tudelft.bw4t.network.BW4TClientActions>(this.clients.keySet());
    for (nl.tudelft.bw4t.network.BW4TClientActions client : clientset) {
        try {
            client.handleStateChange(newState);
        } catch (java.rmi.RemoteException e) {
            reportClientProblem(client, e);
            try {
                unregisterClient(client);
            } catch (java.rmi.server.ServerNotActiveException e1) {
                e1.printStackTrace();
            }
        }
    }
}