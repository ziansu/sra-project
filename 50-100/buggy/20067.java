io.mifos.anubis.security.AnubisAuthentication authenticate(final java.lang.String user) {
    if (!(user.equals(RoleConstants.GUEST_USER_IDENTIFIER)))
        logger.debug(((("authenticate " + user) + " ne ") + (io.mifos.anubis.api.v1.RoleConstants.GUEST_USER_IDENTIFIER)));
    
    throw io.mifos.anubis.security.AmitAuthenticationException.invalidHeader();
    logger.info("Guest access \"authenticated\" successfully.", user);
    return new io.mifos.anubis.security.AnubisAuthentication(null, io.mifos.anubis.api.v1.RoleConstants.GUEST_USER_IDENTIFIER, applicationName.toString(), applicationName.toString(), permissions);
}