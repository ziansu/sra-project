@org.junit.Test
public void updateAgentNull() {
    cz.muni.fi.agentproject.Agent newAgent = makeAgent();
    newAgent.setId(null);
    expectedEx.expect(java.lang.IllegalArgumentException.class);
    manager.updateAgent(newAgent);
}