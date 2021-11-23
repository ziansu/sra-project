void init(org.json.JSONArray data, org.apache.cordova.CallbackContext callback) {
    boolean isOpenMessageRoaming;
    try {
        org.json.JSONObject params = data.getJSONObject(0);
        isOpenMessageRoaming = params.getBoolean("isOpenMessageRoaming");
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        cn.jiguang.cordova.im.JMessageUtils.handleResult(cn.jiguang.cordova.im.JMessagePlugin.ERR_CODE_PARAMETER, cn.jiguang.cordova.im.JMessagePlugin.ERR_MSG_PARAMETER, callback);
        return ;
    }
    cn.jpush.im.android.api.JMessageClient.init(mCordovaActivity.getApplicationContext(), isOpenMessageRoaming);
    cn.jpush.im.android.api.JMessageClient.registerEventReceiver(this);
    cn.jiguang.cordova.im.JMessagePlugin.mCallback = callback;
}