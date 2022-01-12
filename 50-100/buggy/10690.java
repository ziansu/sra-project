public boolean isSatisfiedByBefore(java.util.Date date) {
    java.util.Calendar testDateCal = java.util.Calendar.getInstance(getTimeZone());
    testDateCal.setTime(date);
    testDateCal.set(java.util.Calendar.MILLISECOND, 0);
    java.util.Date originalDate = testDateCal.getTime();
    testDateCal.add(java.util.Calendar.SECOND, (-1));
    java.util.Date timeBefore = getTimeBefore(testDateCal.getTime());
    return (timeBefore != null) && (timeBefore.equals(originalDate));
}