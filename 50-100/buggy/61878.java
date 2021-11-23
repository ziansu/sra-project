@java.lang.Override
public void onSuccess() {
    getLocationManager(response);
    org.deviceconnect.android.event.EventError error = EventManager.INSTANCE.removeEvent(request);
    if (error == (org.deviceconnect.android.event.EventError.NONE)) {
        stopGPS();
        org.deviceconnect.android.profile.DConnectProfile.setResult(response, DConnectMessage.RESULT_OK);
        response.putExtra(DConnectMessage.EXTRA_VALUE, "Unregister OnWatchPosition event");
        sendResponse(response);
    }else {
        org.deviceconnect.android.message.MessageUtils.setUnknownError(response, "Can not unregister event.");
    }
}