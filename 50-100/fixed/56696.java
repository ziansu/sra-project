private java.net.HttpURLConnection sendRequest(java.lang.String path, com.exacttarget.fuelsdk.ETRestConnection.Method method, java.lang.String payload) throws com.exacttarget.fuelsdk.ETSdkException {
    java.net.URL url;
    try {
        url = new java.net.URL(((endpoint) + path));
    } catch (java.net.MalformedURLException ex) {
        throw new com.exacttarget.fuelsdk.ETSdkException((((endpoint) + path) + ": bad URL"), ex);
    }
    return sendRequest(url, method, payload);
}