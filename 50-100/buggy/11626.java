@org.junit.Test
public void testFindAll() throws java.lang.Exception {
    populateData();
    int expectedSize = 12;
    int actualSize = 0;
    java.util.List<net.smartcosmos.dto.things.ThingResponse> response = persistenceService.findAll(tenantUrn);
    org.junit.Assert.assertFalse(response.isEmpty());
    actualSize = response.size();
    org.junit.Assert.assertTrue(((("Expected " + expectedSize) + " but received ") + actualSize), (actualSize == expectedSize));
}