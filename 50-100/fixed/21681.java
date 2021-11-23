@java.lang.Override
public java.util.List<com.stratelia.webactiv.almanach.model.EventOccurrence> generateOccurrencesFrom(java.util.Date date, java.util.List<com.stratelia.webactiv.almanach.model.EventDetail> events) {
    java.util.Calendar endDate = java.util.Calendar.getInstance();
    endDate.add(java.util.Calendar.YEAR, 100);
    return generateOccurrencesInRange(date, new java.util.Date(endDate.getTime()), events);
}