@java.lang.Override
public boolean execute(java.lang.String action, com.evothings.CordovaArgs args, final com.evothings.CallbackContext callbackContext) {
    try {
        if ("startScan".equals(action)) {
            startScan(args, callbackContext);
        }else
            if ("stopScan".equals(action)) {
                stopScan(args, callbackContext);
            }else {
                return false;
            }
        
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        callbackContext.error(e.getMessage());
        return false;
    }
    return true;
}