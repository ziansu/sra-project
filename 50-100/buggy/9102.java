private void arrTimeStringToDate(java.lang.String dateStr) {
    dateStr = dateStr.replaceAll("\\s", "/");
    java.lang.System.out.println(dateStr);
    java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy/MMM/dd/HH:mm", java.util.Locale.US);
    try {
        java.util.Date localDate = df.parse(dateStr);
        this.arr_local_time = localDate;
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
}