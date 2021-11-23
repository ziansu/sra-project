private void adjustDayInMonthIfNeeded(com.hornet.dateconverter.Model calendar) {
    int day = calendar.getDay();
    int daysInMonth = new com.hornet.dateconverter.DateConverter().noOfDaysInMonth(calendar.getYear(), calendar.getMonth());
    if (day > daysInMonth) {
        calendar.setDay(daysInMonth);
    }
}