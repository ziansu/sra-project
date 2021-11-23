public org.lightcouch.Response update(java.lang.Object object, int writeQuorum) {
    org.lightcouch.Response couchDbResponse = client.put(getDBUri(), object, false, writeQuorum, client.getGson());
    org.lightcouch.Response response = new org.lightcouch.Response(couchDbResponse);
    return response;
}