public java.lang.String getCreationDateString() {
    java.util.Date date = new java.util.Date(((timestamp) * 1000));
    java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("MM/dd/yy");
    java.lang.String formattedDate = dateFormat.format(date);
    return formattedDate;
}