private boolean handleAlias(org.json.JSONArray args, final org.apache.cordova.CallbackContext cbCtx) {
    java.lang.String aliasId = args.optString(0, "");
    java.lang.String originalId = args.optString(1, null);
    if (android.text.TextUtils.isEmpty(aliasId)) {
        this.error(cbCtx, "missing alias id");
        return false;
    }
    com.alanhmak.cordova.plugin.MixpanelPlugin.mixpanel.alias(aliasId, originalId);
    cbCtx.success();
    return true;
}