@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    if (action.equals("printTicket")) {
        java.lang.String messages = args.getString(0);
        java.lang.String code = args.getString(1);
        this.print(messages, code, callbackContext);
        return true;
    }
    if (action.equals("printText")) {
        java.lang.String messages = args.getString(0);
        this.printText(messages, callbackContext);
        return true;
    }
    return false;
}