public java.lang.String extractStartTimeAndInputLine(java.lang.String inputLine, java.util.List<parser.DateGroup> groups) {
    for (parser.DateGroup group : groups) {
        java.util.List<java.util.Date> dates = group.getDates();
        startDateToCalendar(dates.get(0));
        if (group.isTimeInferred()) {
            setStartDateTimeDefault();
        }
        inputLine = removeRemoveDateFromInputLine(inputLine, group);
    }
    return inputLine;
}