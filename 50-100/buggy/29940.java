public static org.apache.http.HttpResponse httpPost(java.lang.String url, java.util.Map<java.lang.String, java.lang.Object> para) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String param = gson.toJson(para);
    android.util.Log.w("BCHttpClientUtil", param);
    org.apache.http.entity.StringEntity entity;
    try {
        entity = new org.apache.http.entity.StringEntity(param, org.apache.http.protocol.HTTP.UTF_8);
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
        return null;
    }
    entity.setContentType("application/json");
    return cn.beecloud.BCHttpClientUtil.httpPost(url, entity);
}