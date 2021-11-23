static java.lang.String createAddressConfig(java.lang.String tagName, com.hazelcast.simulator.protocol.registry.ComponentRegistry componentRegistry, int port) {
    java.lang.StringBuilder members = new java.lang.StringBuilder();
    for (com.hazelcast.simulator.protocol.registry.AgentData agentData : componentRegistry.getAgents()) {
        java.lang.String hostAddress = agentData.getPrivateAddress();
        members.append(java.lang.String.format("<%s>%s:%d</%s>%n", tagName, hostAddress, port, tagName));
    }
    return members.toString();
}