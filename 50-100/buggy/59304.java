public calendar.Month getPastMonth(int numberOfMonths) throws java.lang.IllegalStateException {
    int i = months.indexOf(currentMonth);
    if (i < numberOfMonths) {
        addPastMonths(numberOfMonths);
    }
    currentMonth = months.get((i - numberOfMonths));
    currentDate = currentDate.minusMonths(numberOfMonths);
    currentDate = currentDate.plusDays(((currentDate.lengthOfMonth()) - (currentDate.getDayOfMonth())));
    return currentMonth;
}