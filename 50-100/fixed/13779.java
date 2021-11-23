@java.lang.Override
public void onClick(android.view.View v) {
    SaveLogin("Username", mNameText.getText().toString());
    SaveLogin("Hostname", mHostname.getText().toString());
    LoadLogin();
    android.util.Log.d("SAVED HOST", host);
    android.util.Log.d("SAVED USER", username);
    stopService(i);
    startService(i);
}