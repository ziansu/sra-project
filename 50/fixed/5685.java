public double getUtility(negotiator.AgentID agentId, negotiator.Bid bid) {
    for (ai2016.group16.Agent agent : agents)
        if (agent.getId().equals(agentId.toString()))
            return agent.getUtility(bid);
        
    
    return 0;
}