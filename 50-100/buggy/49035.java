private static int daysOfMonth(int year, int month) throws java.lang.Exception {
    if (month < 1) {
        throw new java.lang.IllegalArgumentException("Month cannot be < 1");
    }
    int februaryDays = (DateCalculator.isLeapYear(year)) ? 29 : 28;
    return month == 2 ? februaryDays : DateCalculator.maxMonthDays[(month - 1)];
}