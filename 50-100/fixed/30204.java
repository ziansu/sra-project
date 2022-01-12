public static boolean isTheSameWeek(org.joda.time.DateTime dateTime1, org.joda.time.DateTime dateTime2) {
    return ((dateTime1.getYear()) == (dateTime2.getYear())) && ((dateTime1.getWeekOfWeekyear()) == (dateTime2.getWeekOfWeekyear()));
}