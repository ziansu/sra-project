public static org.openstack4j.connectors.http.HttpResponseImpl wrap(java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers, int responseCode, java.lang.String responseMessage, java.io.InputStream responseInputStream) {
    return new org.openstack4j.connectors.http.HttpResponseImpl(headers, responseCode, responseMessage, responseInputStream);
}