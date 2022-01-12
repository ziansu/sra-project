public static int getDaysInMonth(int year, int month) {
    int _month = month + 1;
    if (_month == 2) {
        if (org.rapla.components.util.DateTools.isLeapYear(year)) {
            return 29;
        }
        return 28;
    }else
        if ((((_month == 4) || (_month == 6)) || (_month == 9)) || (_month == 11)) {
            return 30;
        }else {
            return 31;
        }
    
}