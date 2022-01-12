private void addAgentConfiguration(org.wso2.carbon.databridge.agent.conf.AgentConfiguration agentConfiguration, boolean defaultAgent) throws org.wso2.carbon.databridge.agent.exception.DataEndpointAgentConfigurationException {
    org.wso2.carbon.databridge.agent.DataEndpointAgent agent = new org.wso2.carbon.databridge.agent.DataEndpointAgent(agentConfiguration);
    dataEndpointAgents.put(agent.getAgentConfiguration().getDataEndpointName().toLowerCase(), agent);
    if (defaultAgent) {
        defaultDataEndpointAgentName = agent.getAgentConfiguration().getDataEndpointName();
    }
}