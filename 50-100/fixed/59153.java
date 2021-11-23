@java.lang.Override
public boolean execute(java.lang.String action, org.json.JSONArray args, org.apache.cordova.CallbackContext callbackContext) throws org.json.JSONException {
    if (action.equals("getPhoneNumber")) {
        android.telephony.TelephonyManager telephonyManager = ((android.telephony.TelephonyManager) (this.cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE)));
        java.lang.String result = telephonyManager.getLine1Number();
        callbackContext.success(result);
        return true;
    }
    callbackContext.success("N/A");
    return false;
}