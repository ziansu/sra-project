public void onApplicationEvent(org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent) {
    if (alreadySetup) {
        return ;
    }
    twitter.entity.Privilege readPrivilege = createPrivilegeIfNotFound(RolesAndPrivileges.READ_PRIVILEGE);
    twitter.entity.Privilege changePasswordPrivilege = createPrivilegeIfNotFound(RolesAndPrivileges.CHANGE_PASSWORD_PRIVILEGE);
    twitter.entity.Privilege writePrivilege = createPrivilegeIfNotFound(RolesAndPrivileges.WRITE_PRIVILEGE);
    twitter.entity.Privilege viewPagesPrivilege = createPrivilegeIfNotFound(RolesAndPrivileges.VIEW_PAGES_PRIVILEGE);
    java.util.List<twitter.entity.Privilege> userPrivileges = java.util.Arrays.asList(readPrivilege, writePrivilege, viewPagesPrivilege, changePasswordPrivilege);
    createRoleIfNotFound(RolesAndPrivileges.ROLE_ADMIN, userPrivileges);
    createRoleIfNotFound(RolesAndPrivileges.ROLE_USER, userPrivileges);
    createAdminIfNotExists();
    createDefaultImgIfDoesNotExist(InitialPhotoSettings.DEFAULT_IMG_PATH);
    alreadySetup = true;
}