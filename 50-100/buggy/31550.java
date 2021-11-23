private com.sun.jersey.api.client.ClientResponse getUseSession(final java.lang.String uri) throws java.lang.Exception {
    _log.info(((("####Resolving URI:" + (_baseURL.resolve(uri).toString())) + " There are ") + (_cookies.keySet().size())));
    com.sun.jersey.api.client.ClientResponse clientResp = _client.get_json(_baseURL.resolve(uri), _cookies);
    return clientResp;
}