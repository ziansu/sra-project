private static javax.ws.rs.WebApplicationException unauthorized() {
    org.opendaylight.aaa.sts.ServiceLocator.getInstance().getAuthenticationService().clear();
    return new org.opendaylight.aaa.sts.TokenAuthFilter.UnauthorizedException();
}