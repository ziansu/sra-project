@net.smartcosmos.dao.things.impl.Test
public void thatUpdateNonexistentByTypeAndUrnFails() {
    net.smartcosmos.dto.things.ThingUpdate update = net.smartcosmos.dto.things.ThingUpdate.builder().active(false).build();
    java.util.Optional<net.smartcosmos.dto.things.ThingResponse> responseUpdate = persistenceService.update(tenantUrn, "NO SUCH TYPE", "URN:DOES-NOT-EXIST", update);
    assertFalse(responseUpdate.isPresent());
}