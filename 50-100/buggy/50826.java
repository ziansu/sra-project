public org.apache.tapestry5.json.JSONObject onRefreshZone(@org.apache.tapestry5.annotations.RequestParameter(value = "state")
java.lang.String clientState) {
    java.lang.String serverState = getCurrentState();
    boolean update = org.apache.commons.lang.StringUtils.equalsIgnoreCase(clientState, serverState);
    org.apache.tapestry5.json.JSONObject reply = new org.apache.tapestry5.json.JSONObject();
    reply.put("currentState", serverState);
    reply.put("update", update);
    return reply;
}