public java.lang.String getClientSendMessageRequest(java.lang.String UserAndMessage) {
    org.json.simple.JSONObject jsonObject = new org.json.simple.JSONObject();
    java.lang.String[] substring = UserAndMessage.split("~");
    java.lang.String username;
    java.lang.String message;
    if ((substring.length) != 2) {
        username = "DefaultName";
        message = substring[0];
    }else {
        username = substring[0];
        message = substring[1];
    }
    jsonObject.put("user", username);
    jsonObject.put("message", message);
    return jsonObject.toJSONString();
}