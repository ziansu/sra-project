@java.lang.Override
public boolean onRequest(final android.content.Intent request, final android.content.Intent response) {
    java.lang.String sessionKey = getSessionKey(request);
    if (sessionKey == null) {
        org.deviceconnect.android.message.MessageUtils.setInvalidRequestParameterError(response, "Not found sessionKey");
    }else {
        org.deviceconnect.android.event.EventError error = EventManager.INSTANCE.addEvent(request);
        if (error == (org.deviceconnect.android.event.EventError.NONE)) {
            setResult(response, DConnectMessage.RESULT_OK);
        }else {
            org.deviceconnect.android.message.MessageUtils.setUnknownError(response);
        }
    }
    mLogger.exiting(this.getClass().getName(), "onPutOnPhoto");
    return true;
}