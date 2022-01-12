public edu.jhuapl.dorset.agent.AgentRegistryEntry getAgentEntry(java.lang.String name) {
    name = name.toLowerCase();
    return registry.get(name);
}