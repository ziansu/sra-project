public void setStartDateTimeDefault() {
    startDate.set(java.util.Calendar.HOUR_OF_DAY, parser.JListeeParser.DEFAULT_START_HOUR);
    startDate.set(java.util.Calendar.MINUTE, parser.JListeeParser.DEFAULT_START_MINUTE);
    startDate.set(java.util.Calendar.SECOND, parser.JListeeParser.DEFAULT_START_SECOND);
    startDate.set(java.util.Calendar.MILLISECOND, parser.JListeeParser.DEFAULT_START_MILLISECOND);
}