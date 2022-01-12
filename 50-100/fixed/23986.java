@com.facebook.react.bridge.ReactMethod
public void getAddressState(java.lang.String id, final com.facebook.react.bridge.Promise promise) {
    try {
        com.facebook.react.bridge.WritableMap balanceMock = com.humaniq.apilib.constructor.ModelUtils.convertJsonToMap(new org.json.JSONObject((" {" + (("    \"HMQ\": 190.6," + "    \"USD\": 22.62422") + "  }"))));
        promise.resolve(balanceMock);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}