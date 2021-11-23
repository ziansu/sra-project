public static java.util.Calendar parseDateTime(java.lang.String dateTimeString) throws java.text.ParseException {
    helper.CalendarHelper.FORMAT_DATE_TIME.setLenient(false);
    dateTimeString = dateTimeString.trim();
    java.util.Calendar datetime = java.util.Calendar.getInstance();
    datetime.setTime(helper.CalendarHelper.FORMAT_DATE_TIME.parse(dateTimeString));
    if (!(helper.CalendarHelper.getDateTimeString(datetime).toLowerCase().equals(dateTimeString.toLowerCase()))) {
        throw new java.text.ParseException(dateTimeString, 0);
    }
    return datetime;
}