@java.lang.Override
public boolean isSupported(final ch.cyberduck.core.Path file) {
    try {
        final java.util.Set<ch.cyberduck.core.Acl.Role> roles = containerService.getContainer(file).attributes().getAcl().get(new ch.cyberduck.core.Acl.EmailUser(session.userAccount().getEmail()));
        if (roles != null) {
            return roles.contains(SDSAttributesFinderFeature.DELETE_ROLE);
        }
    } catch (ch.cyberduck.core.sds.io.swagger.client.ApiException e) {
        ch.cyberduck.core.sds.SDSDeleteFeature.log.warn("Unable to retrieve user information", e);
    }
    return true;
}