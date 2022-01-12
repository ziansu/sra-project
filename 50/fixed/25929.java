@java.lang.Override
public void onPwsResultError(java.util.Collection<java.lang.String> urls, int httpResponseCode, java.lang.Exception e) {
    android.widget.Toast.makeText(getApplicationContext(), getString(R.string.shorten_error), Toast.LENGTH_LONG).show();
    stopSelf();
}