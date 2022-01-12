protected void sendEvent(java.lang.String eventName, com.umeng.message.entity.UMessage msg) {
    sendEvent(eventName, convertToWriteMap(msg));
}