public org.json.simple.JSONObject getUpdate(java.lang.String user) {
    org.json.simple.JSONObject retVal = new org.json.simple.JSONObject();
    if (user == null) {
        retVal.put("action", "refresh");
        retVal.put("success", false);
        retVal.put("reason", "User is null");
    }
    org.json.simple.JSONArray messages = new org.json.simple.JSONArray();
    for (javaserver.User current : glbUser) {
        if (current.USER_NAME.equalsIgnoreCase(user)) {
            retVal.put("actions", current.getActionsToTake());
        }
    }
    return retVal;
}