protected java.util.List<java.util.Date> getDateList(int indexOfTimePeriod) {
    if (indexOfTimePeriod < 0) {
        return null;
    }
    java.lang.String eventPeriodString = commandBody.substring(indexOfTimePeriod);
    java.util.List<com.joestelmach.natty.DateGroup> dateGroupList = dateParser.parse(eventPeriodString);
    if (dateGroupList.isEmpty()) {
        return null;
    }else {
        return dateGroupList.get(0).getDates();
    }
}