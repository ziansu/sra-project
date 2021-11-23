public static java.lang.String buildURL() {
    java.lang.String baseUrl = appaloosa_store.com.appaloosa_android_tools.utils.UrlUtils.getServerBaseUrl();
    return baseUrl + (appaloosa_store.com.appaloosa_android_tools.tools.services.blacklist.BlacklistUrlUtils.buildParams());
}