@javax.annotation.PostConstruct
public void init() {
    permissionMap = new java.util.HashMap<>();
    permissionMap.put(Pages.LOGIN, null);
    permissionMap.put(Pages.USER_REGISTRATION, null);
    permissionMap.put(Pages.ERROR_PAGE, null);
    permissionMap.put(Pages.USER_PROFILE, UserRole.AGENT);
    permissionMap.put(Pages.USER_LIST, UserRole.COMPANY_ADMIN);
    permissionMap.put(Pages.COMPANY_REGISTRATION, UserRole.ADMIN);
    permissionMap.put(Pages.COMPANY_PROFILE, UserRole.COMPANY_ADMIN);
    permissionMap.put(Pages.COMPANY_LIST, UserRole.ADMIN);
}