private <T> T[] makeRequest2(au.id.mclowry.tah.RequestMethod.RequestMethod method, java.lang.String end_point_path, java.util.ArrayList<org.apache.http.message.BasicNameValuePair> params, java.lang.Class<T> targetElementClass) throws java.io.IOException {
    try {
        return core.makeRequest(au.id.mclowry.tah.GET, "statuses/show", params, core.getTypeFactory().constructArrayType(targetElementClass));
    } catch (oauth.signpost.exception.OAuthException | java.lang.InterruptedException e) {
        throw new java.io.IOException(e);
    }
}