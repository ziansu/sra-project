public static java.lang.String makeCodeResponse(java.lang.String type, java.lang.String code) {
    org.json.JSONObject object = new org.json.JSONObject();
    object.put("type", type);
    object.put("state", "success");
    object.put("message", code);
    return object.toString();
}