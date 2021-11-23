private java.lang.String addExtraZerosToDate(int year, int month, int day) {
    java.lang.String converteMonth = "";
    java.lang.String converteDay = "";
    if (month < 10) {
        converteMonth += "0";
    }
    if (day < 10) {
        converteDay += "0";
    }
    converteMonth += java.lang.Integer.toString(month);
    converteDay += java.lang.Integer.toString(day);
    return (((converteDay + ".") + converteMonth) + ".") + (java.lang.Integer.toString(year));
}