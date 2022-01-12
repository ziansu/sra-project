org.aiwolf.common.data.Agent attackedAgent() {
    java.util.List<org.aiwolf.common.data.Agent> agentList = currentGameInfo.getAgentList();
    java.util.List<org.aiwolf.common.data.Agent> aliveAgentList = currentGameInfo.getAliveAgentList();
    for (org.aiwolf.common.data.Agent agent : agentList) {
        if ((!(aliveAgentList.contains(agent))) && (currentGameInfo.getExecutedAgent().equals(agent))) {
            return agent;
        }
    }
    return null;
}