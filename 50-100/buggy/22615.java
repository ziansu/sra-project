@java.lang.Override
public void onComplete(org.json.JSONObject responseJSON, java.lang.Error error) {
    if (responseJSON != null) {
        ctx.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.OK, responseJSON));
    }else
        if (error != null) {
            ctx.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.JSON_EXCEPTION, new org.json.JSONObject(error.toMap())));
        }else {
            error = new com.lk.googleplaygames.GPGService2.Error("Player Stats could not be accessed, no specific error code", 1);
            ctx.sendPluginResult(new org.apache.cordova.PluginResult(PluginResult.Status.ERROR, new org.json.JSONObject(error.toMap())));
        }
    
}