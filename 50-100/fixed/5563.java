org.spine3.time.OffsetDateTime parseOffsetDateTime() throws java.text.ParseException {
    initDayOffset();
    initTimezoneOffsetPosition();
    initTimeValues();
    parseTime();
    parseZoneOffset();
    java.util.Calendar calendar = org.spine3.time.Parser.createCalendar(seconds, nanos, zoneOffset);
    final org.spine3.time.LocalDate localDate = org.spine3.time.Calendars.toLocalDate(calendar);
    final org.spine3.time.LocalTime localTime = org.spine3.time.Calendars.toLocalTime(calendar);
    final org.spine3.time.OffsetDateTime result = org.spine3.time.OffsetDateTimes.of(localDate, localTime, zoneOffset);
    return result;
}