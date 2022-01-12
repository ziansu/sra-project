@org.junit.Test
public void testFindByTypeAndUrn() throws java.lang.Exception {
    populateData();
    java.util.Optional<net.smartcosmos.dto.things.ThingResponse> response = persistenceService.findByTypeAndUrn(tenantUrn, net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.TYPE_ONE, net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.URN_01);
    org.junit.Assert.assertTrue(response.isPresent());
    org.junit.Assert.assertEquals(net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.URN_01, response.get().getUrn());
    org.junit.Assert.assertEquals(net.smartcosmos.dao.things.impl.ThingPersistenceServiceTest.TYPE_ONE, response.get().getType());
}