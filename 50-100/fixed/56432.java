private int getNumberOfDaysOfMonth(int i, int pPYear) {
    calendar.set(java.util.Calendar.MONTH, i);
    if (i == 1) {
        if (mGregorianCalendar.isLeapYear(pPYear)) {
            return (calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH)) + 1;
        }else {
            return calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        }
    }else {
        return calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
    }
}