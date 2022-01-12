public static java.util.Date getStartOfMonth(java.util.Date d, int monthAdjustment) {
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.setTime(org.openmrs.module.reporting.common.DateUtil.getStartOfDay(d));
    c.set(java.util.Calendar.DATE, 1);
    c.add(java.util.Calendar.MONTH, monthAdjustment);
    return c.getTime();
}