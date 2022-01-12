public static boolean isDateValid(java.lang.String myDate) {
    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
    java.util.Date testDate;
    sdf.setLenient(false);
    if (Constants.DEFAULT_VALUE.equalsIgnoreCase(myDate)) {
        return true;
    }
    if ((myDate.length()) != (sdf.toPattern().length())) {
        return false;
    }
    try {
        testDate = sdf.parse(myDate);
    } catch (java.text.ParseException e) {
        return false;
    }
    return true;
}