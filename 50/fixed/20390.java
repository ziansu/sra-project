private org.json.JSONObject pingLeader(int type, java.lang.String topicName, java.lang.String notifyMsg) {
    return createNotification(type, topicName, notifyMsg, new org.json.JSONObject());
}