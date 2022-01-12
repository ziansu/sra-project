private boolean handleAlias(org.json.JSONArray args, final org.apache.cordova.CallbackContext cbCtx) {
    java.lang.String aliasId = args.optString(0, "");
    if (android.text.TextUtils.isEmpty(aliasId)) {
        this.error(cbCtx, "missing alias id");
        return false;
    }
    com.alanhmak.cordova.plugin.MixpanelPlugin.mixpanel.alias(aliasId, null);
    cbCtx.success();
    return true;
}