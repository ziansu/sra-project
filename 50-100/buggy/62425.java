private java.lang.String buildFullUrl(java.lang.String uri) {
    if (uri.startsWith("http"))
        return uri;
    
    if (!(uri.startsWith("/")))
        uri = "/" + uri;
    
    return ((cn.momia.common.webapp.config.Configuration.getString("AppConf.WapDomain")) + "/m") + uri;
}