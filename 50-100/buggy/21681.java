@java.lang.Override
public java.util.List<com.stratelia.webactiv.almanach.model.EventOccurrence> generateOccurrencesFrom(com.silverpeas.calendar.Date date, java.util.List<com.stratelia.webactiv.almanach.model.EventDetail> events) {
    java.util.Calendar endDate = java.util.Calendar.getInstance();
    endDate.add(java.util.Calendar.YEAR, 100);
    return generateOccurrencesInRange(date, new com.silverpeas.calendar.Date(endDate.getTime()), events);
}