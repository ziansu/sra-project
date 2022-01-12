@java.lang.Override
public void call(java.lang.Object... args) {
    org.openhab.io.myopenhab.internal.MyOpenHABClient.logger.trace("Transport.EVENT_REQUEST_HEADERS");
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = ((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) (args[0]));
    headers.put("uuid", java.util.Arrays.asList(uuid));
    headers.put("secret", java.util.Arrays.asList(secret));
    headers.put("openhabversion", java.util.Arrays.asList(org.openhab.core.OpenHAB.getVersion()));
    headers.put("myohversion", java.util.Arrays.asList(MyOpenHABService.myohVersion));
}