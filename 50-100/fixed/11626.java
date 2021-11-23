@net.smartcosmos.dao.things.impl.Test
public void testFindAll() throws java.lang.Exception {
    populateData();
    int expectedSize = 12;
    int actualSize = 0;
    java.util.List<net.smartcosmos.dto.things.ThingResponse> response = persistenceService.findAll(tenantUrn);
    assertFalse(response.isEmpty());
    actualSize = response.size();
    assertTrue(((("Expected " + expectedSize) + " but received ") + actualSize), (actualSize == expectedSize));
}