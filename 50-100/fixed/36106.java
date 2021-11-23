public static java.lang.String getWsdTime(java.lang.String sdtime) {
    sdtime = sdtime.substring(((sdtime.indexOf('(')) + 1), sdtime.indexOf(')'));
    java.util.Calendar cal = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(("GMT+" + (sdtime.substring(14, 18)))));
    cal.setTimeInMillis(java.lang.Long.parseLong(sdtime.substring(0, 13)));
    return com.wygdove.hw.common.utils.DateUtil.sdf.format(cal.getTime());
}