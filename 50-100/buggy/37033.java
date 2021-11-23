private java.lang.String convertSGFormalDateToUS(java.lang.String sgDate) {
    java.lang.String usDate = sgDate.replace(dateParser.DateNLP.FWD_SLASH, dateParser.DateNLP.DASH);
    usDate = sgDate.replace(dateParser.DateNLP.DOT, dateParser.DateNLP.DASH);
    usDate = addZero(usDate);
    if (usDate.matches(DATE_REGEX_2DAY_2MONTH)) {
        usDate = swapDayMonth(usDate, dateParser.DateNLP.DASH);
    }
    return usDate;
}