@org.junit.Test
public void deleteByIdAndTenantIdAndType() throws java.lang.Exception {
    java.util.List<net.smartcosmos.dao.things.domain.ThingEntity> deleteList = repository.deleteByIdAndTenantIdAndTypeIgnoreCase(id, tenantId, type);
    org.junit.Assert.assertFalse(deleteList.isEmpty());
    org.junit.Assert.assertEquals(1, deleteList.size());
    org.junit.Assert.assertEquals(id, deleteList.get(0).getId());
}