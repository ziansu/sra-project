public static java.lang.String convertDateToDisplayFormat(java.lang.String date) {
    java.lang.String month = gop.akiladeshwar.movies_1.Utility.months[((java.lang.Integer.parseInt(date.substring(5, 7))) - 1)];
    java.lang.String year = (java.lang.Integer.parseInt(date.substring(2, 4))) + "";
    java.lang.String finalStr = (month + " '") + year;
    return finalStr;
}