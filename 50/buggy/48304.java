@org.junit.Test
public void testFindByTypeAndUrnIsCaseSensitiveUrn() throws java.lang.Exception {
    populateData();
    java.util.Optional<net.smartcosmos.dto.things.ThingResponse> response = persistenceService.findByTypeAndUrn(tenantUrn, net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.TYPE_ONE, net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.URN_01.toUpperCase());
    org.junit.Assert.assertTrue(response.isPresent());
}