private java.sql.Date currentSqlDate() {
    java.util.Date date = java.util.Calendar.getInstance().getTime();
    return new java.sql.Date(date.getTime());
}