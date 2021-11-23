public static int getDaysInMonth(final int year, final int month) {
    if (month == 2) {
        if (org.rapla.components.util.DateTools.isLeapYear(year)) {
            return 29;
        }
        return 28;
    }else
        if ((((month == 4) || (month == 6)) || (month == 9)) || (month == 11)) {
            return 30;
        }else {
            return 31;
        }
    
}