public com.jaspersoft.jasperserver.jaxrs.client.apiadapters.authority.users.SingleUserRequestAdapter user(com.jaspersoft.jasperserver.dto.authority.ClientUser user) {
    if (((user == null) || ((user.getUsername()) == null)) || (user.getUsername().equals(""))) {
        throw new java.lang.IllegalArgumentException("User is not valid.");
    }
    if (((organizationId) != null) && ((user.getTenantId()) == null)) {
        user.setTenantId(organizationId);
    }
    return new com.jaspersoft.jasperserver.jaxrs.client.apiadapters.authority.users.SingleUserRequestAdapter(sessionStorage, user);
}