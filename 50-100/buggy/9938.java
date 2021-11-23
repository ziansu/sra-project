@org.junit.Test
public void testNewInstance() {
    com.graphaware.integration.es.domain.ExternalResult externalResult = new com.graphaware.integration.es.domain.ExternalResult("123", 23.8F);
    assertEquals("123", externalResult.getObjectId());
    assertEquals(23.8F, externalResult.getScore(), 0);
    assertNull(externalResult.getItem());
}