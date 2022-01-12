public static int getWeekOfMonth(org.joda.time.DateTime dateTime) {
    return (((((dateTime.getDayOfMonth()) + (dateTime.withDayOfMonth(1).getDayOfWeek())) - 2) - (com.mikesu.horizontalexpcalendar.common.Utils.firstDayOffset())) / 7) + 1;
}