public static java.util.Map<java.lang.String, java.lang.String> generateRequestHeader() {
    java.util.Map<java.lang.String, java.lang.String> requestHeader = new java.util.HashMap<java.lang.String, java.lang.String>();
    java.util.UUID uuid = java.util.UUID.randomUUID();
    requestHeader.put(com.ws.apple.ayuep.util.HttpHeaderUtil.REQUEST_ID, uuid.toString());
    requestHeader.put(com.ws.apple.ayuep.util.HttpHeaderUtil.APP_PLATFORM, com.ws.apple.ayuep.util.HttpHeaderUtil.APP_ANDROID);
    requestHeader.put(com.ws.apple.ayuep.util.HttpHeaderUtil.REQUEST_TIME, com.ws.apple.ayuep.util.HttpHeaderUtil.getRealTimeForRequestHeader());
    requestHeader.put(com.ws.apple.ayuep.util.HttpHeaderUtil.DEVICE_IDENTITY, com.ws.apple.ayuep.util.HttpHeaderUtil.getDeviceIdentity());
    return requestHeader;
}