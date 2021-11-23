private java.lang.String getDate() {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy年MM月dd日");
    year = calendar.get(java.util.Calendar.YEAR);
    month = calendar.get(java.util.Calendar.MONTH);
    day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    return sdf.format(new java.util.Date());
}