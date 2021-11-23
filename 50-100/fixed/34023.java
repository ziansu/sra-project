@java.lang.Override
public com.hp.application.automation.tools.sse.sdk.Response httpPost(java.lang.String url, byte[] data, java.util.Map<java.lang.String, java.lang.String> headers, com.hp.application.automation.tools.sse.sdk.ResourceAccessLevel resourceAccessLevel) {
    com.hp.application.automation.tools.sse.sdk.Response ret = null;
    try {
        ret = doHttp(RESTConstants.POST, url, null, data, headers, resourceAccessLevel);
    } catch (java.lang.Exception cause) {
        throw new com.hp.application.automation.tools.common.SSEException(cause);
    }
    return ret;
}