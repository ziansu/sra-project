@org.junit.Test
public void whenCreateRole_thenSuccess() throws com.ixtechsol.sec.validation.RoleExistsException, com.ixtechsol.sec.validation.RoleNotFoundException {
    logger.info("\n");
    logger.info("IN whenCreateRole_thenSuccess()");
    if ((roleService.findRoleByName(com.ixtechsol.test.service.RoleCreate.USER_ROLE)) != null) {
        roleService.deleteRole(roleService.findRoleByName(com.ixtechsol.test.service.RoleCreate.USER_ROLE));
        logger.info("\tDelete role {}", com.ixtechsol.test.service.RoleCreate.USER_ROLE);
    }
    com.ixtechsol.sec.model.Role role = new com.ixtechsol.sec.model.Role();
    role.setName(com.ixtechsol.test.service.RoleCreate.USER_ROLE);
    roleService.registerNewRole(role);
    logger.info("OUT whenCreateRole_thenSuccess()");
}