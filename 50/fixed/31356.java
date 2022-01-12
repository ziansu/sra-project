private void addPostalInfo(io.dropwizard.maxmind.geoip2.filter.Postal postal, final javax.ws.rs.container.ContainerRequestContext containerRequestContext) {
    if (!(com.google.common.base.Strings.isNullOrEmpty(postal.getCode())))
        containerRequestContext.getHeaders().putSingle(MaxMindHeaders.X_POSTAL, postal.getCode());
    
}