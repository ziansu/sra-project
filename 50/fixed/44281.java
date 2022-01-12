public java.util.Calendar getBaseDate(java.util.Calendar cal) {
    cal.set(java.util.Calendar.MILLISECOND, 0);
    cal.set(java.util.Calendar.SECOND, 0);
    cal.set(java.util.Calendar.MINUTE, 0);
    cal.set(java.util.Calendar.HOUR, 0);
    return cal;
}