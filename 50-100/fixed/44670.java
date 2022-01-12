public static void addResult(java.lang.String result) {
    java.util.Calendar cal = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(no.westerdals.PG4600.Innlevering1.model.Scoreboard.timeZone));
    java.util.Date currentLocalTime = cal.getTime();
    java.text.DateFormat date = new java.text.SimpleDateFormat("HH:mm a");
    date.setTimeZone(java.util.TimeZone.getTimeZone(no.westerdals.PG4600.Innlevering1.model.Scoreboard.timeZone));
    java.lang.String localTime = date.format(currentLocalTime);
    result = (localTime + " - ") + result;
    no.westerdals.PG4600.Innlevering1.model.Scoreboard.results.add(result);
}