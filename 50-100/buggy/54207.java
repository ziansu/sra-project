private com.mindforger.shiftsolver.shared.model.PeriodPreferences newPeriodPreferences(int year, int month) {
    com.mindforger.shiftsolver.shared.model.PeriodPreferences periodPreferences = new com.mindforger.shiftsolver.shared.model.PeriodPreferences(year, month);
    java.util.Calendar myCalendar = new java.util.GregorianCalendar(year, month, 1);
    int numberOfDaysInMonth = myCalendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
    periodPreferences.setMonthDays(numberOfDaysInMonth);
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    calendar.setTime(myCalendar.getTime());
    int dayOfWeek = calendar.get(java.util.Calendar.DAY_OF_WEEK);
    periodPreferences.setStartWeekDay(dayOfWeek);
    return persistence.createPeriodPreferences(periodPreferences);
}