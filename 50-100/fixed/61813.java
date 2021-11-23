@java.lang.Override
public void onTangoConnectServiceFinish(int response, java.lang.String message) {
    if (response != (tango_ros_messages.TangoConnectResponse.TANGO_SUCCESS)) {
        android.util.Log.e(eu.intermodalics.tango_ros_streamer.RunningActivity.TAG, ((("Error connecting to Tango: " + response) + ", message: ") + message));
        displayToastMessage(R.string.tango_connect_error);
        return ;
    }
    displayToastMessage(R.string.tango_connect_success);
    saveUuidsNamestoHashMap();
}