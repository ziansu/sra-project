@org.junit.BeforeClass
public static void setUp() throws java.lang.Exception {
    com.hazelcast.simulator.agent.AgentSmokeTest.userDir = java.lang.System.getProperty("user.dir");
    java.lang.System.setProperty("user.dir", "./dist/src/main/dist");
    com.hazelcast.simulator.agent.AgentSmokeTest.LOGGER.info(("Agent bind address for smoke test: " + (com.hazelcast.simulator.agent.AgentSmokeTest.AGENT_IP_ADDRESS)));
    com.hazelcast.simulator.agent.AgentSmokeTest.LOGGER.info((("Test runtime for smoke test: " + (com.hazelcast.simulator.agent.AgentSmokeTest.TEST_RUNTIME_SECONDS)) + " seconds"));
    com.hazelcast.simulator.agent.AgentSmokeTest.agentStarter = new com.hazelcast.simulator.agent.AgentSmokeTest.AgentStarter();
    com.hazelcast.simulator.agent.AgentSmokeTest.agentStarter.start();
    com.hazelcast.simulator.agent.AgentSmokeTest.agentsClient = com.hazelcast.simulator.agent.AgentSmokeTest.getAgentsClient();
    com.hazelcast.simulator.agent.AgentSmokeTest.agentsClient.start();
}