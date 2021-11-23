java.lang.String printDate(java.lang.String date) {
    if ((date.length()) != 8)
        return null;
    
    java.lang.String day;
    java.lang.String month;
    java.lang.String year;
    day = date.substring(6, 8);
    month = date.substring(4, 6);
    year = date.substring(0, 4);
    java.lang.String prettyDate = (((month + "/") + day) + "/") + year;
    return prettyDate;
}