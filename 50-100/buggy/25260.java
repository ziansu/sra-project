@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray data, com.dnrps.nfc.CallbackContext callbackContext) throws org.json.JSONException {
    if (action.equals(ACTION_INIT)) {
        java.lang.String user = data.getString(0);
        currentAction = ACTION_INIT;
        init(user, callbackContext);
    }else
        if (action.equals(ACTION_WRITE)) {
            currentAction = ACTION_WRITE;
            java.lang.String message = data.getString(0);
            write(message, callbackContext);
        }else {
            return false;
        }
    
    return true;
}