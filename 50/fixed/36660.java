public boolean setAgent(MAS_LendingSystem.AgentClass agent) {
    if ((this.agent) == null) {
        this.agent = agent;
        return true;
    }
    return false;
}