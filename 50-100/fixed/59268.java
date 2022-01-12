private void setStartEndTime(parser.DateGroup group, java.util.List<java.util.Date> dates) {
    startDateToCalendar(dates.get(0));
    endDateToCalendar(dates.get(1));
    swapDates();
    if (group.isTimeInferred()) {
        setStartDateTimeDefault();
        setEndDateTimeDefault();
    }
}