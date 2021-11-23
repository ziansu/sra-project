protected boolean hasRole(java.lang.String roleName) {
    final java.security.Principal principal = getThreadLocalRequest().getUserPrincipal();
    if (principal == null) {
        return false;
    }
    final org.springframework.security.core.Authentication authentication = ((org.springframework.security.core.Authentication) (principal));
    final org.datacleaner.monitor.server.security.UserBean user = new org.datacleaner.monitor.server.security.UserBean();
    user.updateUser(authentication, getTenantResolver());
    return user.hasRole(roleName);
}