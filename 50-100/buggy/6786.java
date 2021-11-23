private void evaluateNotification(int idx, java.lang.String prayId, java.lang.String prayName, java.util.Date date) {
    cancelNotification(idx);
    cancelNotification((idx + 10));
    long delay = (date.getTime()) - (new java.util.Date().getTime());
    sendPrayAlarm(idx, prayId, prayName, delay);
}