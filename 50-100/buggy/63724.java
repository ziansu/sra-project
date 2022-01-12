@java.lang.Override
public java.net.URI reconstructURIWithServer(com.netflix.loadbalancer.Server server, java.net.URI original) {
    java.lang.String scheme = original.getScheme();
    if ((!("https".equals(scheme))) && (this.serverIntrospector.isSecure(server))) {
        original = org.springframework.web.util.UriComponentsBuilder.fromUri(original).scheme("https").build().toUri();
    }
    return super.reconstructURIWithServer(server, original);
}