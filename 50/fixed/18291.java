@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.common.api.Status status) {
    android.content.Intent resultIntent = new android.content.Intent();
    setResult(com.scientists.happy.botanist.ui.RESULT_OK, resultIntent);
    finish();
}