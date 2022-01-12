protected javax.ws.rs.core.MultivaluedMap createUserParameters(final javax.ws.rs.core.MultivaluedMap queryParams, final Sirius.server.newuser.User user) {
    if ((user.getUserGroup()) != null) {
        queryParams.add("role", user.getUserGroup().getName());
    }
    return queryParams;
}