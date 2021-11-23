private java.lang.String getPortBindingData(java.util.UUID portId, java.util.UUID bindingId, java.lang.String deviceName, java.util.UUID hostId) {
    org.codehaus.jackson.node.JsonNodeFactory jnf = org.codehaus.jackson.node.JsonNodeFactory.instance;
    org.codehaus.jackson.node.ObjectNode json = jnf.objectNode();
    json.put("id", bindingId.toString());
    json.put("host_id", hostId.toString());
    json.put("interface_name", deviceName);
    json.put("port_id", portId.toString());
    return json.toString();
}