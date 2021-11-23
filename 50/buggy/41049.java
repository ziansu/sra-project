@java.lang.Override
public void onStartFailure(int errorCode) {
    android.util.Log.e("BLE", ("Advertising onStartFailure: " + errorCode));
    super.onStartFailure(errorCode);
}