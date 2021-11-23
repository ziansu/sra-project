public static boolean isValidToday(java.lang.String dateToValidate) {
    assert dateToValidate != null;
    dateToValidate.toLowerCase();
    switch (dateToValidate) {
        case "today" :
        case "tdy" :
            return true;
        default :
            return false;
    }
}