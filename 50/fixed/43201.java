public void replaceActive(de.uds.lsv.platon.script.AgentInstance agentInstance) {
    de.uds.lsv.platon.script.AgentInstance activeAgentInstance = getActiveAgentInstance();
    if (activeAgentInstance == null) {
        throw new java.lang.IllegalStateException("There is no active agent!");
    }
    popIncluding(activeAgentInstance, false);
    stack.addFirst(agentInstance);
}