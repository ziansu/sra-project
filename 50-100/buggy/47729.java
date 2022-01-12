public java.sql.Timestamp getTargetTimestamp() {
    if (((targetTimestamp) == null) || ((targetDate) != null)) {
        java.text.DateFormat df = new java.text.SimpleDateFormat("MM/dd/yyyy");
        try {
            targetTimestamp = new java.sql.Timestamp(df.parse(targetDate).getTime());
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }
    return targetTimestamp;
}