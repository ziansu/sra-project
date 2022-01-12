@net.smartcosmos.dao.things.impl.Test
public void testFindByTypeAndUrn() throws java.lang.Exception {
    populateData();
    java.util.Optional<net.smartcosmos.dto.things.ThingResponse> response = persistenceService.findByTypeAndUrn(tenantUrn, net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.TYPE_ONE, net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.URN_01);
    assertTrue(response.isPresent());
    assertEquals(net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.URN_01, response.get().getUrn());
    assertEquals(net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.TYPE_ONE, response.get().getType());
}