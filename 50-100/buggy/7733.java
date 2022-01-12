private void loadMatrixClient() {
    java.lang.System.out.println("=============1");
    util.PropertiesUtil parser = util.PropertiesUtil.getInstance();
    java.lang.System.out.println("=============2");
    java.lang.String serverUrl = parser.getValue("serverUrl");
    java.lang.String appkey = parser.getValue("appkey");
    java.lang.String appSecret = parser.getValue("appSecret");
    java.lang.String randomNum = parser.getValue("randomNum");
    securityClient = new com.taobao.api.security.SecurityClient(new com.taobao.api.DefaultTaobaoClient(serverUrl, appkey, appSecret), randomNum);
}