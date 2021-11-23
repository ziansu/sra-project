public static com.github.bijoysingh.starter.item.TimestampItem getTimestampItem(java.lang.String timestamp, org.joda.time.DateTimeZone dateTimeZone, java.lang.Integer hour, java.lang.Integer minutes) {
    org.joda.time.DateTime dateTime = com.github.bijoysingh.starter.util.TimestampManager.getDateTimeObject(timestamp);
    if (dateTime == null) {
        return new com.github.bijoysingh.starter.item.TimestampItem(timestamp, null, null, java.util.Calendar.getInstance());
    }
    dateTime = dateTime.toDateTime(dateTimeZone);
    dateTime = dateTime.plusHours(5).plusMinutes(30);
    return com.github.bijoysingh.starter.util.TimestampManager.createTimestampItem(timestamp, dateTime);
}