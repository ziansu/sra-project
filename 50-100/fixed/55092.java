@java.lang.Override
public T handleResponse(org.apache.http.HttpResponse response) throws java.io.IOException, org.apache.http.client.ClientProtocolException {
    int status = response.getStatusLine().getStatusCode();
    if ((status >= 200) && (status < 300)) {
        org.apache.http.HttpEntity entity = response.getEntity();
        java.lang.String str = org.apache.http.util.EntityUtils.toString(entity);
        return weixin.popular.util.XMLConverUtil.convertToObject(clazz, new java.lang.String(str.getBytes("utf-8"), "utf-8"));
    }else {
        throw new org.apache.http.client.ClientProtocolException(("Unexpected response status: " + status));
    }
}