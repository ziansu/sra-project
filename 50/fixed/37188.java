public java.util.List<java.lang.String> peerCapabilities() {
    java.lang.String capabilitiesList = prop.getProperty("peer.capabilities", org.ethereum.config.SystemProperties.DEFAULT_PROTOCOL_LIST);
    return java.util.Arrays.asList(capabilitiesList.split(","));
}