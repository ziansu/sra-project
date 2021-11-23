public static java.lang.String getFormattedFullDate(@android.support.annotation.Nullable
java.lang.String inputData) {
    java.lang.String formattedDate = null;
    if (inputData == null) {
        return formattedDate;
    }
    co.techmagic.hr.presentation.util.DateUtil.inputFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
    co.techmagic.hr.presentation.util.DateUtil.outputFullDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
    try {
        java.util.Date date = co.techmagic.hr.presentation.util.DateUtil.inputFormat.parse(inputData);
        formattedDate = co.techmagic.hr.presentation.util.DateUtil.outputFullDateFormat.format(date);
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    return formattedDate;
}