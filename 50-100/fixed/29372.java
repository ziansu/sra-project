private int daysInPrevMonth(int mm, int pPYear) {
    calendar.set(java.util.Calendar.MONTH, (mm - 2));
    if (mm == 3) {
        if (mGregorianCalendar.isLeapYear(pPYear)) {
            return (calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH)) + 1;
        }else {
            return calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        }
    }else {
        return calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
    }
}