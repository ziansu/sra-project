@java.lang.Override
public void onSuccess() {
    getLocationManager(response);
    java.lang.String serviceId = getServiceID(request);
    org.deviceconnect.android.event.EventError error = EventManager.INSTANCE.addEvent(request);
    if (error == (org.deviceconnect.android.event.EventError.NONE)) {
        startGPS(getHighAccuracy(request), ((int) (getInterval(request))));
        mServiceId = serviceId;
        org.deviceconnect.android.profile.DConnectProfile.setResult(response, DConnectMessage.RESULT_OK);
        response.putExtra(DConnectMessage.EXTRA_VALUE, "Register OnWatchPosition event");
    }else {
        org.deviceconnect.android.message.MessageUtils.setUnknownError(response, "Can not register event.");
    }
    sendResponse(response);
}