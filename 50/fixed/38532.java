@java.lang.Override
public void onSuccess(java.lang.Object o) {
    android.util.Log.d(TAG, "Device unregistered for push success");
    pushEnabled = false;
    mpushEnabled = pushEnabled;
    callback.onSuccess(new com.qwasi.sdk.QwasiError().errorWithCode(QwasiErrorCode.QwasiErrorNone, "UnSet Push Token success"));
}