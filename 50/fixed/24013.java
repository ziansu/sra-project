@javax.ws.rs.GET
public javax.ws.rs.core.Response logout() {
    org.apache.shiro.subject.Subject currentUser = org.apache.shiro.SecurityUtils.getSubject();
    if (currentUser.isAuthenticated()) {
        currentUser.logout();
    }
    return javax.ws.rs.core.Response.temporaryRedirect(java.net.URI.create("/login")).build();
}