public final void addStatusMessage(java.lang.String message) {
    java.util.Date date = new java.util.Date();
    edtLog.append(((((new java.sql.Timestamp(date.getTime())) + "> ") + message) + "\n"));
}