public void passAgent() {
    refreshNeighbours();
    SystemY.ClientToClientInterface ctci = makeCTCI(nextNode);
    try {
        ctci.startAgent(agent);
    } catch (java.rmi.RemoteException e) {
        failure(nextNode);
        e.printStackTrace();
    }
    ctci = null;
}