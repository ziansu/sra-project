private java.lang.String getDateTime() {
    java.util.Calendar c = java.util.Calendar.getInstance();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    return sdf.format(c.getTime());
}