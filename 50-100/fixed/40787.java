public static java.util.Date getDate(java.lang.String dateFormat) {
    java.text.DateFormat df = new java.text.SimpleDateFormat(com.example.haruka.rescue_aid.utils.QADateFormat.simpleDateFormat);
    java.util.Date date = null;
    try {
        date = df.parse(dateFormat);
    } catch (java.lang.Exception e) {
        date = new java.util.Date();
    }
    return date;
}