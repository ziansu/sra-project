@java.lang.Override
public void callback(java.lang.String url, java.lang.String result, com.androidquery.callback.AjaxStatus status) {
    android.util.Log.e(cc.softwarefactory.lokki.android.utilities.ServerApi.TAG, ("setVisibility result code: " + (status.getCode())));
    android.util.Log.e(cc.softwarefactory.lokki.android.utilities.ServerApi.TAG, ("setVisibility result message: " + (status.getMessage())));
    android.util.Log.e(cc.softwarefactory.lokki.android.utilities.ServerApi.TAG, ("setVisibility ERROR: " + (status.getError())));
}