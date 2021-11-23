private void requestAd(org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    final java.lang.String zoneId = args.getString(0);
    if (zoneId != null) {
        zoneCallbacks.put(zoneId, callbackContext);
    }else {
        defaultZoneCallback = callbackContext;
    }
    ir.tapsell.sdk.TapsellExtraPlatforms.requestAd(cordova.getActivity(), zoneId);
}