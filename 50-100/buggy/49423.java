@org.junit.Test
public void whenCreateRole_thenSuccess() throws com.ixtechsol.sec.validation.RoleExistsException, com.ixtechsol.sec.validation.RoleNotFoundException {
    logger.info("\n");
    logger.info("IN whenCreateRole_thenSuccess()");
    com.ixtechsol.sec.model.Role role = roleService.findRoleByName(com.ixtechsol.test.service.RoleCreate.USER_ROLE);
    if (role != null) {
        roleService.deleteRole(role);
        logger.info("\tDelete role {}", com.ixtechsol.test.service.RoleCreate.USER_ROLE);
    }
    role.setName(com.ixtechsol.test.service.RoleCreate.USER_ROLE);
    roleService.registerNewRole(role);
    logger.info("OUT whenCreateRole_thenSuccess()");
}