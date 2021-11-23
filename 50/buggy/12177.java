@java.lang.Override
public void messageArrived(java.lang.String topic, adapters.MqttMessage message) throws java.lang.Exception {
    org.json.JSONObject event = new org.json.JSONObject(new java.lang.String(message.getPayload()));
    events.offer(event);
    java.lang.System.out.println(("event arrived:" + event));
}