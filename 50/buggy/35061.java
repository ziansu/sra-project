private void calculateDayPeriods(java.util.Calendar date) {
    dayPeriodDates = new java.util.ArrayList(org.eyeseetea.malariacare.utils.Constants.MONITOR_HISTORY_SIZE);
    date.add(java.util.Calendar.DAY_OF_YEAR, (-1));
    dayPeriodsKeys = calculatePeriods(date.getTime(), java.util.Calendar.DATE, KEY_DAY_FORMATTER, dayPeriodDates);
}