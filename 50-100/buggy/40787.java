public static java.util.Date getDate(java.lang.String dateFormat) {
    java.text.DateFormat df = new java.text.SimpleDateFormat(com.example.haruka.rescue_aid.utils.QADateFormat.simpleDateFormat);
    java.util.Date date = null;
    try {
        android.util.Log.d("Date format", dateFormat);
        date = df.parse(dateFormat);
    } catch (java.lang.Exception e) {
        android.util.Log.e("Date format", e.toString());
        date = new java.util.Date();
    }
    return date;
}