protected org.anarres.dhcp.v6.messages.Dhcp6Message createDhcp6Message(@javax.annotation.Nonnull
org.anarres.dhcp.v6.messages.Dhcp6MessageType messageType, org.anarres.dhcp.v6.options.Dhcp6Option... options) {
    org.anarres.dhcp.v6.messages.Dhcp6Message request = new org.anarres.dhcp.v6.messages.Dhcp6Message();
    request.setMessageType(Dhcp6MessageType.DHCP_RELEASE);
    org.anarres.dhcp.v6.options.Dhcp6Options o = new org.anarres.dhcp.v6.options.Dhcp6Options();
    o.addAll(java.util.Arrays.asList(options));
    request.setOptions(o);
    return request;
}