@com.facebook.react.bridge.ReactMethod
public void sharedInstanceWithToken(java.lang.String apiToken) {
    this.mixpanel = com.mixpanel.android.mpmetrics.MixpanelAPI.getInstance(this.reactContext, apiToken);
    android.util.Log.d("mixpanel", "sharedInstanceWithToken");
}