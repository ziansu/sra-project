public static com.validation.manager.core.db.VmUser createUser(java.lang.String name, java.lang.String pass, java.lang.String email, java.lang.String first, java.lang.String last) throws java.lang.Exception {
    com.validation.manager.core.server.core.VMUserServer temp = new com.validation.manager.core.server.core.VMUserServer(name, pass, first, last, email);
    temp.setUserStatusId(new com.validation.manager.core.db.controller.UserStatusJpaController(com.validation.manager.core.DataBaseManager.getEntityManagerFactory()).findUserStatus(1));
    temp.write2DB();
    return new com.validation.manager.core.db.controller.VmUserJpaController(com.validation.manager.core.DataBaseManager.getEntityManagerFactory()).findVmUser(temp.getId());
}