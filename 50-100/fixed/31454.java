@java.lang.Override
public synchronized void storeSignal(java.lang.Long date, java.lang.Long experimentId, java.lang.Long alarmTime, java.lang.String groupName, java.lang.Long actionTriggerId, java.lang.Long scheduleId) {
    java.util.List<org.joda.time.DateTime> existing = store.get(date);
    if (existing == null) {
        existing = com.google.common.collect.Lists.newArrayList();
        store.put(date, existing);
    }
    final org.joda.time.DateTime at = new org.joda.time.DateTime(alarmTime);
    existing.add(at);
}