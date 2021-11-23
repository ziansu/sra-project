@net.smartcosmos.dao.things.impl.Test
public void testFindByType() throws java.lang.Exception {
    populateData();
    int expectedSize = 3;
    int actualSize = 0;
    java.util.List<net.smartcosmos.dto.things.ThingResponse> response = persistenceService.findByType(tenantUrn, net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.TYPE_ONE);
    actualSize = response.size();
    assertTrue(((("Expected " + expectedSize) + " but received ") + actualSize), (actualSize == expectedSize));
}