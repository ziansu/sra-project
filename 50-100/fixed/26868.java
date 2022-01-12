private void depTimeStringToDate(java.lang.String dateStr) {
    dateStr = dateStr.replaceAll("\\s", "/");
    java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy/MMM/dd/HH:mm", java.util.Locale.forLanguageTag("english"));
    try {
        java.util.Date localDate = df.parse(dateStr);
        this.dep_local_time = localDate;
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
}