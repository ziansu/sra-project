@dao.Test(expected = org.springframework.dao.EmptyResultDataAccessException.class)
public void testCreateAndGetAndDelete() throws java.lang.Exception {
    role = roleService.create(role);
    assertNotNull(roleService.findOne(role.getId()));
    roleService.delete(role.getId());
    roleService.findOne(role.getId());
}