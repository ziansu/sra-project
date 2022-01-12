@java.lang.SuppressWarnings(value = "unchecked")
public void send() {
    org.json.simple.JSONObject msgJson = new org.json.simple.JSONObject();
    msgJson.put("type", "stream");
    msgJson.put("content", accu);
    java.lang.String message = accu.toJSONString();
    try {
        channel.basicPublish("", sendTo, properties, message.getBytes("UTF-8"));
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
    java.lang.System.out.println(((" [D] Sent stream message (" + (properties.getCorrelationId())) + ")"));
}