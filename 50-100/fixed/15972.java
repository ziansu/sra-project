public org.lightcouch.Response post(java.lang.Object object) {
    org.lightcouch.internal.CouchDbUtil.assertNotEmpty(object, "object");
    org.lightcouch.Response response = null;
    java.net.URI uri = org.lightcouch.internal.URIBuilder.buildUri(getDBUri()).build();
    response = client.post(uri);
    return response;
}