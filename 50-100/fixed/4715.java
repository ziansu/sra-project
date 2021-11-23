public int daysBetween(org.joda.time.DateTime startDateTime, org.joda.time.DateTime endDateTime) {
    int daysBetween = 0;
    if ((startDateTime != null) && (endDateTime != null)) {
        daysBetween = org.joda.time.Days.daysBetween(startDateTime, endDateTime).getDays();
    }
    java.lang.System.out.println(daysBetween);
    return daysBetween;
}