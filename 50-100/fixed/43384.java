@net.smartcosmos.dao.things.repository.Test
public void findByTenantIdAndType() throws java.lang.Exception {
    java.util.List<net.smartcosmos.dao.things.domain.ThingEntity> entityList = repository.findByTenantIdAndTypeIgnoreCase(tenantId, type);
    assertFalse(entityList.isEmpty());
    assertEquals(1, entityList.size());
    assertEquals(id, entityList.get(0).getId());
}