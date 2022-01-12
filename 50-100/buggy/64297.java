@java.lang.Override
public boolean onRequest(final android.content.Intent request, final android.content.Intent response) {
    org.deviceconnect.android.message.DConnectMessageService service = ((org.deviceconnect.android.message.DConnectMessageService) (getContext()));
    if (!(service.isUseLocalOAuth())) {
        org.deviceconnect.android.message.MessageUtils.setNotSupportProfileError(response);
        service.sendResponse(response);
        return true;
    }
    return super.onRequest(request, response);
}