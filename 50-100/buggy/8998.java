public java.lang.String getTodayPlusDay(int days) {
    java.util.Date heute = new java.util.Date();
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
    java.util.Calendar c = java.util.Calendar.getInstance();
    c.setTime(heute);
    c.add(java.util.Calendar.DATE, days);
    java.lang.String df = sdf.format(c.getTime());
    return df;
}