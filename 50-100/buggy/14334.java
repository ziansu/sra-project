public int getPrevMonth() {
    if ((cal.get(java.util.Calendar.MONTH)) == (cal.getActualMinimum(java.util.Calendar.MONTH))) {
        cal.set(java.util.Calendar.YEAR, cal.get(((java.util.Calendar.YEAR) - 1)));
    }else {
    }
    int month = cal.get(java.util.Calendar.MONTH);
    if (month == 0) {
        return month = 11;
    }
    return month - 1;
}