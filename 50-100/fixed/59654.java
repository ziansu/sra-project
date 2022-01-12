public org.json.simple.JSONArray getUpdate(java.lang.String user) {
    org.json.simple.JSONArray retVal = null;
    org.json.simple.JSONArray messages = new org.json.simple.JSONArray();
    for (javaserver.User current : glbUser) {
        if (current.USER_NAME.equalsIgnoreCase(user)) {
            retVal = current.getActionsToTake();
        }
    }
    return retVal;
}