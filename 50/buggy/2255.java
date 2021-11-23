@javax.ws.rs.GET
public javax.ws.rs.core.Response logout(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request) {
    org.apache.shiro.SecurityUtils.getSubject().logout();
    return javax.ws.rs.core.Response.ok().build();
}