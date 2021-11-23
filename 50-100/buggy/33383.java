@java.lang.Override
protected org.apache.shiro.authz.AuthorizationInfo doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection principals) {
    java.lang.String currentUsercode = ((java.lang.String) (super.getAvailablePrincipal(principals)));
    com.chdp.chdpweb.bean.User user = userService.getUser(currentUsercode);
    if (user != null) {
        org.apache.shiro.authz.SimpleAuthorizationInfo simpleAuthorInfo = new org.apache.shiro.authz.SimpleAuthorizationInfo();
        for (com.chdp.chdpweb.bean.UserAuthority auth : userService.getUserAuthority(user)) {
            simpleAuthorInfo.addRole(auth.name());
            return simpleAuthorInfo;
        }
    }
    return null;
}