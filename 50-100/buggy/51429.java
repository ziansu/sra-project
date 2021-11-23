private void updateLabel() {
    java.lang.String myFormat = "MM/dd/yy";
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(myFormat, java.util.Locale.US);
    etBeginDate.setText(sdf.format(myCalendar.getTime()));
    java.lang.String format = "yyyy-MM-dd";
    java.text.SimpleDateFormat mysdf = new java.text.SimpleDateFormat(format, java.util.Locale.US);
    begin_date = mysdf.format(myCalendar.getTime()).replaceAll("[-+.^:,]", "");
}