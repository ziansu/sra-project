@java.lang.Override
public void call(java.lang.Object... args) {
    org.openhab.io.myopenhab.internal.MyOpenHABClient.logger.trace("Transport.EVENT_REQUEST_HEADERS");
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.Map<java.lang.String, java.lang.String> headers = ((java.util.Map<java.lang.String, java.lang.String>) (args[0]));
    headers.put("uuid", uuid);
    headers.put("secret", secret);
    headers.put("openhabversion", org.openhab.core.OpenHAB.getVersion());
    headers.put("myohversion", MyOpenHABService.myohVersion);
}