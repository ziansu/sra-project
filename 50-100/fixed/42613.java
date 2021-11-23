public static java.util.Calendar parseTime(java.lang.String timeString) throws java.text.ParseException {
    timeString = timeString.trim();
    java.util.Calendar time = java.util.Calendar.getInstance();
    time.setTime(helper.CalendarHelper.FORMAT_TIME.parse(timeString));
    if (!(helper.CalendarHelper.getTimeString(time).toLowerCase().equals(timeString.toLowerCase()))) {
        throw new java.text.ParseException(timeString, 0);
    }
    return time;
}