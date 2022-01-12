@org.junit.Test
public void findByTenantIdAndType() throws java.lang.Exception {
    java.util.List<net.smartcosmos.dao.things.domain.ThingEntity> entityList = repository.findByTenantIdAndTypeIgnoreCase(tenantId, type);
    org.junit.Assert.assertFalse(entityList.isEmpty());
    org.junit.Assert.assertEquals(1, entityList.size());
    org.junit.Assert.assertEquals(id, entityList.get(0).getId());
}