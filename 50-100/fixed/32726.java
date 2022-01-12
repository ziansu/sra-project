public java.lang.String getTodaysDate() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US);
    cal.add(java.util.Calendar.DAY_OF_YEAR, 0);
    java.util.Date yesterday = cal.getTime();
    return df.format(yesterday);
}