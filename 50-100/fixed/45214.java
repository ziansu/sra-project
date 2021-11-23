public java.lang.String getParam(java.lang.String key) {
    try {
        return mParams.containsKey(key) ? new java.lang.String(mParams.get(key)[0].getBytes("iso-8859-1"), com.coderyuan.api.BaseWebApiServlet.DES_CHARSET) : null;
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return mParams.containsKey(key) ? mParams.get(key)[0] : null;
}