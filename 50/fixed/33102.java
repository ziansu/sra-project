public java.lang.String getTime() {
    java.sql.Date currentTime = new java.sql.Date(java.lang.System.currentTimeMillis());
    return formatter.format(currentTime);
}