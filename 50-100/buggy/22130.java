private java.lang.String formatDate(int day, int month, int year) {
    java.lang.String sMonth;
    java.lang.String sDay;
    if (day < 10) {
        sDay = "0" + day;
    }else {
        sDay = "" + day;
    }
    if (month < 10) {
        sMonth = "0" + month;
    }else {
        sMonth = "" + month;
    }
    return (((sDay + ".") + sMonth) + ".") + year;
}