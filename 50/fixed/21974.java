public static java.lang.String getUrl() {
    if (((com.rokid.cloudappclient.http.BaseUrlConfig.mHost) == null) || (com.rokid.cloudappclient.http.BaseUrlConfig.mHost.isEmpty())) {
        com.rokid.cloudappclient.http.BaseUrlConfig.mHost = com.rokid.cloudappclient.http.BaseUrlConfig.DEFAULT_HOST;
    }
    return ((com.rokid.cloudappclient.http.BaseUrlConfig.BASE_HTTP) + (com.rokid.cloudappclient.http.BaseUrlConfig.mHost)) + (com.rokid.cloudappclient.http.BaseUrlConfig.SEND_EVENT_PATH);
}