@java.lang.Override
public boolean onRequest(final android.content.Intent request, final android.content.Intent response) {
    org.deviceconnect.android.event.EventError error = EventManager.INSTANCE.addEvent(request);
    if (error == (org.deviceconnect.android.event.EventError.NONE)) {
        setResult(response, DConnectMessage.RESULT_OK);
    }else {
        org.deviceconnect.android.message.MessageUtils.setUnknownError(response);
    }
    mLogger.exiting(this.getClass().getName(), "onPutOnPhoto");
    return true;
}