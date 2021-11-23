private boolean CheckDates(java.util.Date startDate, java.util.Date endDate) {
    if (startDate.before(endDate)) {
        goodDates = true;
    }
    return goodDates;
}