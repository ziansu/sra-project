@java.lang.Override
protected org.apache.shiro.authz.AuthorizationInfo doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection principalCollection) {
    java.lang.System.out.println("doGetAuthorizationInfo......................");
    net.mshop.Principal principal = ((net.mshop.Principal) (principalCollection.fromRealm(getName()).iterator().next()));
    if (principal != null) {
        java.util.List<java.lang.String> authorities = adminService.findAuthorities(principal.getId());
        if (authorities != null) {
            org.apache.shiro.authz.SimpleAuthorizationInfo authorizationInfo = new org.apache.shiro.authz.SimpleAuthorizationInfo();
            authorizationInfo.addStringPermissions(authorities);
            return authorizationInfo;
        }
    }
    return null;
}