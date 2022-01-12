public void removeMatcherEndpoint(net.powermatcher.api.MatcherEndpoint matcherEndpoint) {
    removeAgent(matcherEndpoint);
    java.lang.String agentId = matcherEndpoint.getAgentId();
    synchronized(potentialSessions) {
        for (net.powermatcher.runtime.PotentialSession ps : potentialSessions.get(agentId)) {
            ps.disconnect();
            ps.setMatcherEndpoint(null);
        }
        matcherEndpoints.remove(agentId);
    }
}