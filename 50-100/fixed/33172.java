private static void printCalendarMonthHeader(java.util.Calendar calendar) {
    java.lang.System.out.println((((" " + (chapter_13.PE_13_04_Display_calendars.MONTH_NAMES[calendar.get(java.util.Calendar.MONTH)])) + " ") + (calendar.get(java.util.Calendar.YEAR))));
    java.lang.System.out.println("-----------------------------");
    java.lang.System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
}