private java.util.GregorianCalendar convertDateStringToGregorianCalendar(java.lang.String source) {
    java.lang.String[] date = source.split("-");
    return new java.util.GregorianCalendar(java.lang.Integer.parseInt(date[0]), java.lang.Integer.parseInt(date[1]), java.lang.Integer.parseInt(date[2]));
}