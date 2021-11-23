@net.smartcosmos.dao.things.impl.Test
public void thatDuplicateIdFails() {
    final java.lang.String uuid = "238978cb-c279-47e6-a553-92f2c372ae1d";
    final java.lang.String urn = "urn:thing:uuid:" + uuid;
    net.smartcosmos.dto.things.ThingCreate create = net.smartcosmos.dto.things.ThingCreate.builder().urn(urn).type("type").build();
    java.util.Optional<net.smartcosmos.dto.things.ThingResponse> response1 = persistenceService.create(tenantUrn, create);
    assertTrue(response1.isPresent());
    java.util.Optional<net.smartcosmos.dto.things.ThingResponse> response2 = persistenceService.create(tenantUrn, create);
    assertFalse(response2.isPresent());
}