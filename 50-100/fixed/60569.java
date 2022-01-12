public static java.lang.String getRequest(java.lang.String url) {
    org.apache.http.client.methods.HttpGet httpRequest = new org.apache.http.client.methods.HttpGet(url);
    java.lang.String resp = "";
    try {
        org.apache.http.HttpResponse httpResponse = new org.apache.http.impl.client.DefaultHttpClient().execute(httpRequest);
        java.io.InputStream inputStream = httpResponse.getEntity().getContent();
        if (inputStream != null)
            resp = com.sjtu.pcm.util.HttpUtil.convertInputStreamToString(inputStream);
        
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return resp;
}