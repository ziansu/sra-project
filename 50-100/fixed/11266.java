public org.json.JSONObject toJson() {
    org.json.JSONObject toJson = new org.json.JSONObject();
    toJson.put(BoraApplicationConstants.EVENT_ID_KEY_JSON, id).put(BoraApplicationConstants.EVENT_NAME_KEY_JSON, name).put(BoraApplicationConstants.EVENT_DATE_KEY_JSON, date).put(BoraApplicationConstants.EVENT_ATTENDEES_KEY_JSON, attendees).put(BoraApplicationConstants.EVENT_PHOTOS_KEY_JSON, photoNames);
    return toJson;
}