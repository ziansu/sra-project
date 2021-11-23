@java.lang.Override
public java.lang.String getUrlName() {
    java.lang.String url = globalConfig.getSlackOutgoingWebhookURL();
    if ((url == null) || (url.equals("")))
        return java.util.UUID.randomUUID().toString().replaceAll("-", "");
    
    return "/" + url;
}