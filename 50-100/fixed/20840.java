private void adjustDayInMonthIfNeeded(com.hornet.dateconverter.Model calendar) {
    int day = calendar.getDay();
    int daysInMonth = new com.hornet.dateconverter.DateConverter().noOfDaysInMonth(calendar.getYear(), ((calendar.getMonth()) + 1));
    if (day > daysInMonth) {
        calendar.setDay(daysInMonth);
    }
}