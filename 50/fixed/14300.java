public org.json.JSONObject toJson() {
    org.json.JSONObject toJson = new org.json.JSONObject();
    toJson.put(BoraApplicationConstants.ATTENDEE_EMAIL_KEY_JSON, email).put(BoraApplicationConstants.ATTENDEE_NAME_KEY_JSON, name);
    return toJson;
}