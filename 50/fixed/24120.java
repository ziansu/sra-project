private boolean CheckDates(java.util.Date startDate, java.util.Date endDate) {
    if ((startDate.getTime()) < (endDate.getTime())) {
        goodDates = true;
    }
    return goodDates;
}