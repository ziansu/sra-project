public slash.common.type.CompactCalendar asUTCTimeInTimeZone(java.util.TimeZone timeZone) {
    return new slash.common.type.CompactCalendar(((timeInMillis) + (timeZone.getOffset(timeInMillis))), "UTC");
}