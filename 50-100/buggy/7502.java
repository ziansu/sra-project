@java.lang.Override
public com.google.gson.JsonElement serialize(final net.onrc.openvirtex.elements.port.OVXPort port, final java.lang.reflect.Type portType, final com.google.gson.JsonSerializationContext context) {
    final com.google.gson.JsonObject result = new com.google.gson.JsonObject();
    result.addProperty("dpid", port.getParentSwitch().getSwitchName());
    result.addProperty("port", java.lang.String.valueOf(port.getPortNumber()));
    return result;
}