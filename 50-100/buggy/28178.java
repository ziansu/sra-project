private RouterInterface createInterface(java.util.Map<java.lang.String, java.lang.String> interfaceResult) throws me.legrange.mikrotik.MikrotikApiException {
    java.lang.String interfaceAddress = interfaceResult.get("address");
    java.lang.String interfaceLabel = interfaceResult.get("interface");
    int bandwidth = getBandwidth(interfaceAddress);
    java.lang.System.out.println((((((identity) + ": Adding interface object for ") + interfaceAddress) + " on interface ") + interfaceLabel));
    return new RouterInterface(interfaceLabel, this, identity, bandwidth);
}