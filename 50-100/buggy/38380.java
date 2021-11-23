@org.junit.Test
public void testFindByTypeIsCaseInSensitive() throws java.lang.Exception {
    populateData();
    int expectedSize = 0;
    int actualSize = 0;
    java.util.List<net.smartcosmos.dto.things.ThingResponse> response = persistenceService.findByType(tenantUrn, net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.TYPE_ONE.toUpperCase());
    org.junit.Assert.assertFalse(response.isEmpty());
}