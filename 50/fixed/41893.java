@net.smartcosmos.dao.things.impl.Test
public void testFindByTypeAndUrnNonExistent() throws java.lang.Exception {
    populateData();
    java.util.Optional<net.smartcosmos.dto.things.ThingResponse> response = persistenceService.findByTypeAndUrn(tenantUrn, net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.WHATEVER, net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.URN_01);
    assertFalse(response.isPresent());
}