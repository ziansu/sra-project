public static java.lang.String getAsString(java.io.InputStream response, java.lang.String e) {
    java.io.Reader reader = null;
    try {
        reader = new java.io.InputStreamReader(response, "UTF-8");
        return com.cloudant.client.org.lightcouch.internal.CouchDbUtil.getAsString(new com.google.gson.JsonParser().parse(reader).getAsJsonObject(), e);
    } catch (java.io.UnsupportedEncodingException e1) {
        throw new java.lang.RuntimeException(e1);
    } finally {
        com.cloudant.client.org.lightcouch.internal.CouchDbUtil.close(reader);
        com.cloudant.client.org.lightcouch.internal.CouchDbUtil.close(response);
    }
}