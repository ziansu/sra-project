public void registerOnStatusChange(final android.content.Intent response, final java.lang.String serviceId) {
    mOnStatusChangeEventFlag = true;
    response.putExtra(DConnectMessage.EXTRA_RESULT, DConnectMessage.RESULT_OK);
    sendResponse(response);
}