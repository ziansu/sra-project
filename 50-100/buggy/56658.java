public void executeAgent() {
    try {
        agent.agentArrived(this, peerStorage.getSelf());
        LOG.debug("BEFORE REGISTER AGENT");
        registry.rebind(agent.getId().toString(), agent.getRemoteInterface());
        LOG.debug("JUST REGISTERED AGENT");
    } catch (java.rmi.RemoteException ex) {
        LOG.error("Could not create registry: {}", ex.getMessage());
        ex.printStackTrace();
    }
}