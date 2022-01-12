public static java.lang.String getDays(java.lang.String date) {
    if (date == null) {
        return com.fh.util.DateUtil.sdfDays.format(new java.util.Date());
    }else {
        return com.fh.util.DateUtil.sdfDays.format(date);
    }
}