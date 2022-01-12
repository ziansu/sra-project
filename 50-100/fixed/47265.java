@java.lang.Override
public void onResponse(com.taobao.weex.common.WXResponse response, java.util.Map<java.lang.String, java.lang.String> headers) {
    if ((callback != null) && ((mWXSDKInstance) != null))
        com.taobao.weex.bridge.WXBridgeManager.getInstance().callback(mWXSDKInstance.getInstanceId(), callback, ((response == null) || ((response.originalData) == null) ? "{}" : com.taobao.weex.http.WXStreamModule.readAsString(response.originalData, (headers != null ? com.taobao.weex.http.WXStreamModule.getHeader(headers, "Content-Type") : ""))));
    
}