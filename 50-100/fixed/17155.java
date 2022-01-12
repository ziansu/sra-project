@net.smartcosmos.dao.things.repository.Test
public void deleteByIdAndTenantIdAndType() throws java.lang.Exception {
    java.util.List<net.smartcosmos.dao.things.domain.ThingEntity> deleteList = repository.deleteByIdAndTenantIdAndType(id, tenantId, type);
    assertFalse(deleteList.isEmpty());
    assertEquals(1, deleteList.size());
    assertEquals(id, deleteList.get(0).getId());
}