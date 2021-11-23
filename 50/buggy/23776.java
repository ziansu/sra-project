@java.lang.Override
public void onStopListening(com.twilio.client.Device inDevice, int inErrorCode, java.lang.String inErrorMessage) {
    if ((basicDeviceListener) != null)
        basicDeviceListener.onDeviceStoppedListening(new java.lang.Exception(inErrorMessage));
    
    android.util.Log.d("===============>", "Go");
}