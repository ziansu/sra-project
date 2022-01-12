public static java.util.Date getEndOfMonth(java.util.Date d, int monthAdjustment) {
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.setTime(org.openmrs.module.reporting.common.DateUtil.getEndOfDay(d));
    c.set(java.util.Calendar.DATE, c.getActualMaximum(java.util.Calendar.DATE));
    c.add(java.util.Calendar.MONTH, monthAdjustment);
    return c.getTime();
}