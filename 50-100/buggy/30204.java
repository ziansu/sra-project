public static boolean isTheSameWeek(org.joda.time.DateTime dateTime1, org.joda.time.DateTime dateTime2) {
    org.joda.time.DateTime secondDateMovedByFirstDayOfWeek = new org.joda.time.DateTime(dateTime2).minusDays(com.mikesu.horizontalexpcalendar.common.Utils.firstDayOffset());
    return ((dateTime1.getYear()) == (secondDateMovedByFirstDayOfWeek.getYear())) && ((dateTime1.getWeekOfWeekyear()) == (secondDateMovedByFirstDayOfWeek.getWeekOfWeekyear()));
}