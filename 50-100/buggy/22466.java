private static java.util.Date parseInputDate(java.lang.String stringDateInput) {
    java.util.Date inputDate = null;
    for (java.text.SimpleDateFormat format : parser.DateChecker.supportedDateFormats) {
        format.setLenient(false);
        try {
            inputDate = format.parse(stringDateInput);
            break;
        } catch (java.text.ParseException e) {
            java.lang.System.out.println(e.toString());
        }
    }
    return inputDate;
}