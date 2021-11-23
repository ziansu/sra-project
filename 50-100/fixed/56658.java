public void executeAgent() {
    try {
        agent.agentArrived(this, peerStorage.getSelf());
        registry.rebind(agent.getId().toString(), agent.getRemoteInterface());
    } catch (java.rmi.RemoteException ex) {
        LOG.error("Could not create registry: {}", ex.getMessage());
        ex.printStackTrace();
    }
}