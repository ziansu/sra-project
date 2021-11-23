@java.lang.Override
public void onResult(com.google.android.gms.wearable.DataApi.DataItemResult dataItemResult) {
    if (dataItemResult.getStatus().isSuccess()) {
        android.util.Log.e("Watch Log", "Successfully send weather info");
    }else {
        android.util.Log.e("Watch Log", "Failed to send weather info ");
    }
}