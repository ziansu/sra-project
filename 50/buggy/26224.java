@java.lang.Override
public void onFailure(retrofit2.Call call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, getString(R.string.set_userdestination_api_fail), Toast.LENGTH_LONG);
}