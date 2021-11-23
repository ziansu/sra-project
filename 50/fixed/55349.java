private void addStateInfo(io.dropwizard.maxmind.geoip2.filter.Subdivision subdivision, final javax.ws.rs.container.ContainerRequestContext containerRequestContext) {
    if (!(com.google.common.base.Strings.isNullOrEmpty(subdivision.getName())))
        containerRequestContext.getHeaders().putSingle(MaxMindHeaders.X_STATE, subdivision.getName());
    
}