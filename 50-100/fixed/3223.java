void init(org.json.JSONArray data, org.apache.cordova.CallbackContext callback) throws org.json.JSONException {
    org.json.JSONObject params = data.getJSONObject(0);
    boolean isOpenMessageRoaming = params.getBoolean("isOpenMessageRoaming");
    cn.jpush.im.android.api.JMessageClient.init(mCordovaActivity.getApplicationContext(), isOpenMessageRoaming);
    cn.jpush.im.android.api.JMessageClient.registerEventReceiver(this);
    mCallback = callback;
}