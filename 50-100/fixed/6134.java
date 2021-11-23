public static java.util.Calendar parseDate(java.lang.String dateString) throws java.text.ParseException {
    helper.CalendarHelper.FORMAT_DATE.setLenient(false);
    dateString = dateString.trim();
    java.util.Calendar date = java.util.Calendar.getInstance();
    date.setTime(helper.CalendarHelper.FORMAT_DATE.parse(dateString));
    if (!(helper.CalendarHelper.getDateString(date).toLowerCase().equals(dateString.toLowerCase()))) {
        throw new java.text.ParseException(dateString, 0);
    }
    return date;
}