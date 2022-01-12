@org.junit.Test
public void testGetNumAgentForSameAgent() {
    for (int i = 0; i < (numLoop); i++) {
        sim.util.Double2D location = toTest.getAvailableRandomLocation();
        java.lang.System.out.println(location);
        toTest.setDistributedObjectLocation(location, sa, ss);
    }
    assertEquals(1, toTest.getNumAgents());
}