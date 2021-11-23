public static java.lang.String getAsString(java.io.InputStream response, java.lang.String e) {
    java.io.InputStream instream = null;
    try {
        java.io.Reader reader = new java.io.InputStreamReader(instream, "UTF-8");
        return com.cloudant.client.org.lightcouch.internal.CouchDbUtil.getAsString(new com.google.gson.JsonParser().parse(reader).getAsJsonObject(), e);
    } catch (java.io.UnsupportedEncodingException e1) {
        throw new java.lang.RuntimeException(e1);
    } finally {
        com.cloudant.client.org.lightcouch.internal.CouchDbUtil.close(instream);
    }
}