public static java.lang.String code(java.lang.String city, java.lang.String urlname, java.lang.String key) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    try {
        builder.append(urlname).append("?cityname=").append(java.net.URLEncoder.encode(city, "UTF-8")).append("&").append("key=").append(key);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    android.util.Log.i("look_up", builder.toString());
    return builder.toString();
}