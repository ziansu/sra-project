public static java.lang.String timestampToDate(java.lang.String timestamp) {
    java.lang.Long unixtimestamp = java.lang.Long.parseLong(timestamp);
    android.util.Log.d("Debug", ("TimeStamp: " + unixtimestamp));
    if ("4294967295".equals(unixtimestamp)) {
        return "";
    }
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd-HH:mm");
    java.util.Date date = new java.util.Date((unixtimestamp * 1000));
    return new java.text.SimpleDateFormat("dd/MM/yyyy - HH:mm").format(date);
}