private static void setActiveRangeFromEncoded(java.lang.String encoded) {
    final com.github.trainjezelf.datastore.TimeRange range = new com.github.trainjezelf.datastore.TimeRange(encoded);
    com.github.trainjezelf.alarm.AlarmScheduler.activeStartHour = range.getFromHour();
    com.github.trainjezelf.alarm.AlarmScheduler.activeStartMinute = range.getFromMinute();
    com.github.trainjezelf.alarm.AlarmScheduler.activeEndHour = range.getUntilHour();
    com.github.trainjezelf.alarm.AlarmScheduler.activeEndMinute = range.getUntilMinute();
}