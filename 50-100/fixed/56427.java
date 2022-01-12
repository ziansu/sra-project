public static java.lang.String convertToStringDate(java.lang.String date) {
    java.lang.String[] newDate = date.split("-");
    return ((((eTrams.utilities.helperClasses.TimeDateConverterClass.numberToStringDate(newDate[1])) + " ") + (newDate[2])) + " ") + (newDate[0]);
}