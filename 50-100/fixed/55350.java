protected org.apache.http.HttpResponse doInBackground(java.lang.String... urlStr) {
    org.apache.http.client.HttpClient httpClient = new org.apache.http.impl.client.DefaultHttpClient();
    org.apache.http.HttpEntity httpEntity;
    if (!(urlStr[0].endsWith("?")))
        urlStr[0] += "?";
    
    java.lang.String paramString = org.apache.http.client.utils.URLEncodedUtils.format(params, "utf-8");
    org.apache.http.client.methods.HttpGet httpGet = new org.apache.http.client.methods.HttpGet(((urlStr[0]) + paramString));
    try {
        return httpClient.execute(httpGet);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        return null;
    }
}