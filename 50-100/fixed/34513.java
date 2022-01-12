static java.lang.String toUrl(net.groboclown.p4.simpleswarm.SwarmConfig config, java.lang.String path, java.util.Map<java.lang.String, ?> query) throws java.io.UnsupportedEncodingException {
    if (((config == null) || (path == null)) || ((config.getUri()) == null)) {
        return null;
    }
    return ((((config.getUri().toASCIIString()) + (net.groboclown.p4.simpleswarm.impl.BasicRequest.API_PATH)) + (config.getVersionPath())) + path) + (net.groboclown.p4.simpleswarm.impl.BasicRequest.toQuery(query));
}