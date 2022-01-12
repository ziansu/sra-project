private com.google.api.client.util.DateTime getStartDate(java.sql.Timestamp timestamp) {
    int year = timestamp.getYear();
    int month = timestamp.getMonth();
    int day = timestamp.getDay();
    int hour = timestamp.getHours();
    java.util.Date date = new java.util.Date(year, month, (day - 1), hour, 0);
    return new com.google.api.client.util.DateTime(date);
}