public void checkDates(java.lang.String firstDate, java.lang.String lastDate) {
    if (convertStringDate(firstDate).after(convertStringDate(lastDate))) {
        java.lang.String temp = firstDate;
        firstDate = lastDate;
        lastDate = temp;
    }
    java.util.Date firstDayDate;
    lastDate = getNextDay(lastDate);
    while (!(firstDate.equals(lastDate))) {
        firstDayDate = convertStringDate(firstDate);
        createDate(firstDayDate, null);
        firstDate = getNextDay(firstDate);
    } 
}