@java.lang.Override
protected boolean onDeleteLight(final android.content.Intent request, final android.content.Intent response, final java.lang.String serviceId, final java.lang.String lightId) {
    return sendLightRequest(serviceId, lightId, "DELETE", response);
}