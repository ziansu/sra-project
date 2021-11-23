@java.lang.Override
public com.hp.application.automation.tools.sse.sdk.Response httpGet(java.lang.String url, java.lang.String queryString, java.util.Map<java.lang.String, java.lang.String> headers, com.hp.application.automation.tools.sse.sdk.ResourceAccessLevel resourceAccessLevel) {
    com.hp.application.automation.tools.sse.sdk.Response ret = null;
    try {
        ret = doHttp(RESTConstants.GET, url, queryString, null, headers, resourceAccessLevel);
    } catch (java.lang.Throwable cause) {
        throw new com.hp.application.automation.tools.common.SSEException(cause);
    }
    return ret;
}