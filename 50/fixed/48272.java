public static java.lang.String convertDateToDateString(java.util.Date date) {
    try {
        return new java.text.SimpleDateFormat(sg.com.fbs.core.techinfra.util.DateUtil.DEFAULT_DATE_FORMAT).format(date);
    } catch (java.lang.Exception e) {
        sg.com.fbs.core.techinfra.util.DateUtil.logger.error(e.getMessage());
        return null;
    }
}