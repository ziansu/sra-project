public static long stripTime(long date) {
    java.util.Calendar calc = com.kidsdynamic.swing.androidswingapp.ViewCalendar.getInstance();
    calc.setTimeInMillis(date);
    calc.clear(java.util.Calendar.HOUR_OF_DAY);
    calc.clear(java.util.Calendar.MINUTE);
    calc.clear(java.util.Calendar.SECOND);
    calc.clear(java.util.Calendar.MILLISECOND);
    return calc.getTimeInMillis();
}