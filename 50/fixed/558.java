@org.junit.Test(expected = org.graylog2.plugin.alarms.callbacks.AlarmCallbackException.class)
public void graylogBaseUrlRetrievalInvalidUri() throws org.graylog2.plugin.alarms.callbacks.AlarmCallbackException {
    org.graylog2.alarmcallbacks.hipchat.HipChatAlarmCallback.getGraylogBaseUrl("invalid URI");
}