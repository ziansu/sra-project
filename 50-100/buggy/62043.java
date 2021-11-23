@dao.Test
public void testCreateAndGetAndDelete() throws java.lang.Exception {
    role = roleService.create(role);
    assertNotNull(roleService.findOne(role.getId()));
    roleService.delete(role.getId());
    assertNull(roleService.findOne(role.getId()));
}