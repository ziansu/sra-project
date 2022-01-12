public static java.util.Date StrToStartDate(java.lang.String str) {
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
    java.util.Date date = null;
    try {
        date = format.parse(str);
    } catch (java.lang.Exception e) {
        com.abel.hwes.util.SwapDateAndStringUtil.log.error(e.getMessage());
        date = com.abel.hwes.util.SwapDateAndStringUtil.StrToStartDate("2006-08-01");
    }
    return date;
}