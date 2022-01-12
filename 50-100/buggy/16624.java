private static org.apache.http.HttpEntity buildEntity(com.facebook.react.bridge.ReadableMap params) {
    org.apache.http.HttpEntity entity = null;
    if (params != null) {
        try {
            org.json.JSONObject json = new org.json.JSONObject(com.salesforce.androidsdk.reactnative.bridge.ReactBridgeHelper.toJavaMap(params));
            entity = new org.apache.http.entity.StringEntity(json.toString(), org.apache.http.protocol.HTTP.UTF_8);
        } catch (java.io.UnsupportedEncodingException e) {
            android.util.Log.e("NetReactBridge", "buildEntity failed", e);
        }
    }
    return entity;
}