public void setValidUntilTime(java.lang.String time) {
    try {
        long t = hk.ust.cse.comp4521.reminder.util.DateTimeParser.toLong(time, DateTimeParser.Format.SHORT);
        validUntilTime = new java.sql.Time(hk.ust.cse.comp4521.reminder.util.DateTimeParser.toHour(t), hk.ust.cse.comp4521.reminder.util.DateTimeParser.toMin(t), 0);
    } catch (java.text.ParseException e) {
    }
}