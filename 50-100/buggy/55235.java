public static void main(java.lang.String[] args) {
    com.yaroslav.other.calendar.InputReader inputReader = new com.yaroslav.other.calendar.InputReader();
    java.util.Calendar customerCalendar = inputReader.getFirstDayOfMonth(args);
    com.yaroslav.other.calendar.MonthCalendar monthCalendar = new com.yaroslav.other.calendar.MonthCalendar();
    monthCalendar.init(customerCalendar);
    java.lang.System.out.println(customerCalendar.toString());
}