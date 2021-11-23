@android.annotation.SystemApi
public void setDataEnabled(boolean enable) {
    try {
        android.app.AppOpsManager appOps = ((android.app.AppOpsManager) (mContext.getSystemService(Context.APP_OPS_SERVICE)));
        if (enable) {
            if ((appOps.noteOp(AppOpsManager.OP_DATA_CONNECT_CHANGE)) != (android.app.AppOpsManager.MODE_ALLOWED)) {
                android.util.Log.w(android.telephony.TelephonyManager.TAG, "Permission denied by user.");
                return ;
            }
        }
        setDataEnabled(android.telephony.SubscriptionManager.getDefaultDataSubId(), enable);
    } catch (android.os.RemoteException e) {
        android.util.Log.e(android.telephony.TelephonyManager.TAG, "Error calling setDataEnabled", e);
    }
}