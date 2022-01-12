public org.json.simple.JSONObject asJSON() {
    org.json.simple.JSONObject obj = new org.json.simple.JSONObject();
    obj.put("username", username);
    obj.put("password", password);
    obj.put("firstName", firstName);
    obj.put("lastName", lastName);
    obj.put("emailAddress", emailAddress);
    obj.put("lastLogin", lastLogin);
    obj.put("type", "cheapSubscription");
    return obj;
}