org.spine3.time.OffsetDateTime parseOffsetDateTime() throws java.text.ParseException {
    initDayOffset();
    initTimezoneOffsetPosition();
    initTimeValues();
    parseTime();
    parseZoneOffset();
    @java.lang.SuppressWarnings(value = "NumericCastThatLosesPrecision")
    final org.spine3.time.ZoneOffset offset = org.spine3.time.ZoneOffsets.ofSeconds(((int) (zoneOffset)));
    java.util.Calendar calendar = org.spine3.time.Parser.createCalendar(seconds, nanos, offset);
    final org.spine3.time.LocalDate localDate = org.spine3.time.Calendars.toLocalDate(calendar);
    final org.spine3.time.LocalTime localTime = org.spine3.time.Calendars.toLocalTime(calendar);
    final org.spine3.time.OffsetDateTime result = org.spine3.time.OffsetDateTimes.of(localDate, localTime, offset);
    return result;
}