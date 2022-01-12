public net.ilexiconn.magister.container.Session login() throws java.io.IOException {
    logout();
    java.util.Map<java.lang.String, java.lang.String> nameValuePairMap = gson.fromJson(gson.toJson(user), new com.google.gson.reflect.TypeToken<java.util.Map<java.lang.String, java.lang.String>>() {    }.getType());
    java.lang.String data = gson.toJson(user);
    session = gson.fromJson(net.ilexiconn.magister.util.HttpUtil.httpPost(schoolUrl.getSessionUrl(), data), net.ilexiconn.magister.container.Session.class);
    loginTime = java.lang.System.currentTimeMillis();
    return session;
}