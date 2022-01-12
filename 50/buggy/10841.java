public static int getMonthNo(java.lang.String pattern, java.lang.String month) throws java.text.ParseException {
    java.util.Calendar cal = com.adms.utils.DateUtil.getCurrentCalendar();
    cal.setTime(new java.text.SimpleDateFormat(pattern).parse(pattern));
    return cal.get(java.util.Calendar.MONTH);
}