@com.facebook.react.bridge.ReactMethod
public void isSimCardValid(com.facebook.react.bridge.Callback callback) {
    android.telephony.TelephonyManager tm = ((android.telephony.TelephonyManager) (this.reactContext.getSystemService(Context.TELEPHONY_SERVICE)));
    com.wangghon.RNSimInfo.Bool isSimCardValid = (tm.getSimState()) == (android.telephony.TelephonyManager.SIM_STATE_READY);
    callback.invoke(isSimCardValid);
}