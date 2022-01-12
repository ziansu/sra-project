public void setValidUntilDate(java.lang.String date) {
    try {
        long t = hk.ust.cse.comp4521.reminder.util.DateTimeParser.toLong(date, DateTimeParser.Format.DATE);
        validUntilDate = new java.sql.Date(((hk.ust.cse.comp4521.reminder.util.DateTimeParser.toYear(t)) - 1900), hk.ust.cse.comp4521.reminder.util.DateTimeParser.toMonth(t), hk.ust.cse.comp4521.reminder.util.DateTimeParser.toDay(t));
    } catch (java.text.ParseException e) {
    }
}