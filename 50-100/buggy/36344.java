@java.lang.Deprecated
public static java.util.Date convertLocalDateToUtc(java.util.Date localDate, double localTimeZone) {
    java.util.Calendar localCal = teammates.common.util.TimeHelper.dateToCalendar(localDate);
    localCal.add(java.util.Calendar.MINUTE, ((int) (60 * (-localTimeZone))));
    return localCal.getTime();
}