public static java.lang.String formatDateForFeedbackSubmissionEditPage(java.util.Date date, double timeZone) {
    if (date == null) {
        return "";
    }
    teammates.common.util.TimeHelper.log.info(("" + timeZone));
    java.util.Calendar calInUtc = teammates.common.util.TimeHelper.convertToUserTimeZone(teammates.common.util.TimeHelper.dateToCalendar(date), (-timeZone));
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
    return sdf.format(calInUtc.getTime());
}