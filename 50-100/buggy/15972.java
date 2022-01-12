public org.lightcouch.Response post(java.lang.Object object) {
    org.lightcouch.internal.CouchDbUtil.assertNotEmpty(object, "object");
    org.lightcouch.HttpResponse response = null;
    try {
        java.net.URI uri = org.lightcouch.internal.URIBuilder.buildUri(getDBUri()).build();
        response = client.post(uri, getGson().toJson(object));
        return org.lightcouch.internal.CouchDbUtil.getResponse(response, org.lightcouch.Response.class, client.getGson());
    } finally {
        org.lightcouch.internal.CouchDbUtil.close(response);
    }
}