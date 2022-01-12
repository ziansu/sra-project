@java.lang.Override
public java.lang.String getProxyCallbackUrl() {
    if ((proxyCallbackPath) == null) {
        return null;
    }
    java.lang.String path = (context.getContextPath()) + (proxyCallbackPath);
    return org.springframework.security.web.util.UrlUtils.buildFullRequestUrl(context.getScheme(), context.getServerName(), context.getServerPort(), path, null);
}