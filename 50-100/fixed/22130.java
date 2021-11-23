private java.lang.String formatDate(int day, int month, int year) {
    java.lang.String sMonth;
    java.lang.String sDay;
    month++;
    if (day < 10) {
        sDay = "0" + day;
    }else {
        sDay = java.lang.Integer.toString(day);
    }
    if (month < 10) {
        sMonth = "0" + month;
    }else {
        sMonth = java.lang.Integer.toString(month);
    }
    return (((sDay + ".") + sMonth) + ".") + year;
}