public boolean isNoRoleUserAccounts() {
    return !(org.libreplan.web.security.SecurityUtils.isSuperuserOrUserInRoles(UserRole.ROLE_USER_ACCOUNTS));
}