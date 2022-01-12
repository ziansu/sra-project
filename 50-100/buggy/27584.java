private java.util.Calendar[] parseDates(java.lang.String dateString) {
    java.util.List<java.util.Date> tempDates1 = dateParser.parse(dateString);
    java.util.List<java.util.Date> tempDates2 = dateParser.parse(dateString);
    java.util.Calendar startDate = getStartDate(tempDates1, tempDates2);
    java.util.Calendar endDate = getEndDate(tempDates1, tempDates2);
    java.util.Calendar[] dates = new java.util.Calendar[]{ startDate , endDate };
    return dates;
}