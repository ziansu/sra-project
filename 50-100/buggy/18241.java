@java.lang.Override
public javax.ws.rs.core.Response unRegisterRequest(final java.lang.String requestId) {
    try {
        registrationManager.rejectRequest(requestId);
        return javax.ws.rs.core.Response.ok().build();
    } catch (java.lang.Exception e) {
        return javax.ws.rs.core.Response.serverError().entity(e.getMessage()).build();
    }
}