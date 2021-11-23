@org.junit.Test
public void testMethods() {
    com.graphaware.integration.es.domain.ExternalResult externalResult = new com.graphaware.integration.es.domain.ExternalResult("123", 12.0F);
    externalResult.setNodeId(1L);
    externalResult.setScore(15.23F);
    externalResult.setObjectId("dd-23-ee");
    assertEquals(1L, externalResult.getNodeId());
    assertEquals(15.23F, externalResult.getScore(), 0);
    assertEquals("dd-23-ee", externalResult.getObjectId());
}