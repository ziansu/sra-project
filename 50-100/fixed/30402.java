private com.cupertino.cordova.plugin.PluginResult executeRequestInterstitialAd(org.json.JSONObject options, com.cupertino.cordova.plugin.CallbackContext callbackContext) {
    this.setOptions(options);
    if ((interstitialAd) == null) {
        callbackContext.error("interstitialAd is null, call createInterstitialView first");
        return null;
    }
    final com.cupertino.cordova.plugin.CallbackContext delayCallback = callbackContext;
    cordova.getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            interstitialAd.loadAd(buildAdRequest());
            delayCallback.success();
        }
    });
    return null;
}