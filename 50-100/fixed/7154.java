private java.util.Calendar mergeDate(java.util.Date d, java.sql.Time t) {
    java.util.Calendar dCal = java.util.Calendar.getInstance();
    dCal.setTime(d);
    if (t == null) {
        return dCal;
    }
    java.util.Calendar tCal = java.util.Calendar.getInstance();
    tCal.setTime(t);
    dCal.set(java.util.Calendar.HOUR_OF_DAY, tCal.get(java.util.Calendar.HOUR_OF_DAY));
    dCal.set(java.util.Calendar.MINUTE, tCal.get(java.util.Calendar.MINUTE));
    dCal.set(java.util.Calendar.SECOND, tCal.get(java.util.Calendar.SECOND));
    return dCal;
}