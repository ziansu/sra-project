@org.junit.Test
public void findByIdAndTenantId() throws java.lang.Exception {
    org.junit.Assert.assertTrue(this.repository.findByIdAndTenantIdAndTypeIgnoreCase(id, tenantId, type).isPresent());
}