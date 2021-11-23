public org.json.JSONObject serialiseToJSON() throws org.json.JSONException {
    org.json.JSONObject returnObject = new org.json.JSONObject();
    returnObject.put("groupId", this.groupID);
    returnObject.put("groupName", this.groupName);
    returnObject.put("parentGroups", this.parentGroups);
    returnObject.put("childGroups", this.childGroups);
    returnObject.put("permissions", this.permissions);
    java.lang.System.out.println(returnObject);
    return returnObject;
}