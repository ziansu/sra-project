public java.lang.String getClientSendMessageRequest(java.lang.String UserAndMessage) {
    org.json.simple.JSONObject jsonObject = new org.json.simple.JSONObject();
    java.lang.String[] substring = UserAndMessage.split("~");
    java.lang.String username;
    java.lang.String textMessage;
    if ((substring.length) != 2) {
        username = "DefaultName";
        textMessage = substring[0];
    }else {
        username = substring[0];
        textMessage = substring[1];
    }
    jsonObject.put("user", username);
    jsonObject.put("message", textMessage);
    return jsonObject.toJSONString();
}