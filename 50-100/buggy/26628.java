public void checkDates(java.lang.String firstDate, java.lang.String lastDate) {
    if (convertStringDate(firstDate).after(convertStringDate(lastDate))) {
        java.lang.String temp = firstDate;
        firstDate = lastDate;
        lastDate = temp;
    }
    while (!(firstDate.equals(lastDate))) {
        java.util.Date firstDayDate = convertStringDate(firstDate);
        createDate(firstDayDate, null);
        firstDate = getNextDay(firstDate);
    } 
}