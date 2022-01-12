public static java.lang.String makeSuccessResponse(java.lang.String type, java.lang.String message) {
    org.json.JSONObject object = new org.json.JSONObject();
    object.put("type", type);
    object.put("state", "success");
    object.put("message", message);
    return object.toString();
}