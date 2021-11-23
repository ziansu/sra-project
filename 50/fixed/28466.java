private void putDescriptionInJSONObj(org.json.simple.JSONObject object, java.lang.String description) {
    if (null != description) {
        object.put("description", description);
    }else {
        object.put("description", "");
    }
}