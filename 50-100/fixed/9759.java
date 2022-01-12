public void onApplicationEvent(org.springframework.context.event.ContextRefreshedEvent contextRefreshedEvent) {
    if (alreadySetup) {
        return ;
    }
    twitter.entity.Privilege viewPagesPrivilege = createPrivilegeIfNotFound(RolesAndPrivileges.VIEW_PAGES_PRIVILEGE);
    java.util.List<twitter.entity.Privilege> userPrivileges = java.util.Arrays.asList(viewPagesPrivilege);
    createRoleIfNotFound(RolesAndPrivileges.ROLE_ADMIN, userPrivileges);
    createRoleIfNotFound(RolesAndPrivileges.ROLE_USER, userPrivileges);
    createAdminIfNotExists();
    createDefaultImgIfDoesNotExist(InitialPhotoSettings.DEFAULT_IMG_PATH);
    alreadySetup = true;
}