@java.lang.Override
public byte[] DoConnection(java.lang.String strUrl, int requestType, java.util.Map<java.lang.String, java.lang.String> params) throws java.lang.Exception {
    java.net.HttpURLConnection urlConnection = getHttpURLConnection(new java.net.URL(strUrl));
    byte[] bytes = doConect(urlConnection, requestType, params);
    if (null == bytes) {
        throw new java.lang.Exception(IHttpHelper.NET_ERROR.toString());
    }else {
        return bytes;
    }
}