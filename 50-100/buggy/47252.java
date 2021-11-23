@java.lang.Override
public void onResult(com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult result) {
    if (result.getStatus().isSuccess()) {
        android.util.Log.i(name.chadschultz.nearbyapidemo.MainActivity.TAG, "Successfully advertising");
        showMessage("Successfully advertising");
        changeCurrentScreen(name.chadschultz.nearbyapidemo.MainActivity.MESSAGE_SCREEN_CAMERA);
        advertising = true;
    }else {
        int statusCode = result.getStatus().getStatusCode();
        android.util.Log.e(name.chadschultz.nearbyapidemo.MainActivity.TAG, ("advertising failed with status code " + statusCode));
        showMessage(("advertising failed with status code " + statusCode));
        advertising = false;
    }
}