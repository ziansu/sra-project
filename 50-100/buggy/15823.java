@java.lang.Override
public boolean beforeHandshake(org.springframework.http.server.ServerHttpRequest request, org.springframework.http.server.ServerHttpResponse response, org.springframework.web.socket.WebSocketHandler wsHandler, java.util.Map<java.lang.String, java.lang.Object> attributes) throws java.lang.Exception {
    org.apache.shiro.subject.Subject subject = org.apache.shiro.SecurityUtils.getSubject();
    if (!(subject.isAuthenticated())) {
        response.setStatusCode(HttpStatus.UNAUTHORIZED);
        return false;
    }
    attributes.put("subject", subject);
    return false;
}