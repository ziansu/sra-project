protected com.cloud.agent.manager.AgentAttache getAttache(final java.lang.Long hostId) throws com.cloud.exception.AgentUnavailableException {
    if (hostId == null) {
        return null;
    }
    com.cloud.agent.manager.AgentAttache agent = findAttache(hostId);
    if (agent == null) {
        com.cloud.agent.manager.AgentManagerImpl.s_logger.debug(("Unable to find agent for " + hostId));
        throw new com.cloud.exception.AgentUnavailableException("Unable to find agent ", hostId);
    }
    return agent;
}