@java.lang.Override
protected boolean onPostLight(final android.content.Intent request, final android.content.Intent response, final java.lang.String serviceId, final java.lang.String lightId, final java.lang.Integer color, final java.lang.Double brightness, final long[] flashing) {
    return sendLightRequest(serviceId, lightId, "POST", response);
}