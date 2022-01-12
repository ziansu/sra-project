private java.sql.Timestamp getStartingTimestampOfXMonthsAgo(int months) {
    months = months * (-1);
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.add(java.util.Calendar.MONTH, (months + 1));
    cal.set(java.util.Calendar.DATE, 1);
    cal.set(java.util.Calendar.HOUR_OF_DAY, 0);
    cal.set(java.util.Calendar.MINUTE, 0);
    cal.set(java.util.Calendar.SECOND, 0);
    cal.set(java.util.Calendar.MILLISECOND, 0);
    return new java.sql.Timestamp(cal.getTimeInMillis());
}