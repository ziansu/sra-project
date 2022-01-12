private void setMaxAllowedBandwidthUsagePercentage(org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    final int maxPercentage = args.getInt(0);
    ir.tapsell.sdk.TapsellExtraPlatforms.setMaxAllowedBandwidthUsagePercentage(cordova.getActivity(), maxPercentage);
    callbackContext.success();
}