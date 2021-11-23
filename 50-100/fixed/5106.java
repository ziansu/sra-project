@net.smartcosmos.dao.things.repository.Test
public void findByTenantIdAndType() throws java.lang.Exception {
    org.springframework.data.domain.Page<net.smartcosmos.dao.things.domain.ThingEntity> entityPage = repository.findByTenantIdAndType(tenantId, type, null);
    assertFalse(entityPage.getContent().isEmpty());
    assertEquals(1, entityPage.getContent().size());
    assertEquals(id, entityPage.getContent().get(0).getId());
}