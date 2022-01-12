public java.lang.String execHttpPost() {
    ru.pits.restClient.RestClient rc = new ru.pits.restClient.RestClient();
    ru.pits.restClient.RestRequest rr = new ru.pits.restClient.RestRequest(headersMap.get("Host"), headersMap.get("url"));
    rr.setHeadersMap(this.headersMap);
    rr.setRequest(new com.sun.jersey.core.util.MultivaluedMapImpl().add(setBodyValue()));
    return rc.execute(rr);
}