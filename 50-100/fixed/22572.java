private org.openstack4j.openstack.compute.domain.NovaAddresses.NovaAddress novaAddress(java.lang.String ip, java.lang.String type) {
    java.lang.String dummyMacAddr = "01:23:45:67:89:ab";
    int version = 4;
    java.lang.String asJson = java.lang.String.format(("{\"macAddr\": \"%s\", " + (("\"version\": %d, " + "\"addr\": \"%s\", ") + "\"type\": \"%s\"}")), dummyMacAddr, version, ip, type);
    return com.elastisys.scale.commons.json.JsonUtils.toObject(com.elastisys.scale.commons.json.JsonUtils.parseJsonString(asJson), org.openstack4j.openstack.compute.domain.NovaAddresses.NovaAddress.class);
}