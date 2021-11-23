public static javax.ws.rs.core.Response validationAdmin(java.lang.String sessionId) {
    javax.ws.rs.core.Response result = javax.ws.rs.core.Response.status(401).build();
    com.baremind.data.User admin = com.baremind.utils.JPAEntry.getLoginUser(sessionId);
    if (((admin != null) && ((admin.getIsAdministrator()) != null)) && (admin.getIsAdministrator())) {
        result = javax.ws.rs.core.Response.status(202).build();
    }
    return result;
}