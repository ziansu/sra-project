public static int calculate(int year, int month, int day) {
    if (month < 3) {
        year = year - month;
    }
    return (((((year + (year / 4)) - (year / 100)) + (year / 400)) + (utils.DayOfWeek.t[(month - 1)])) + day) % 7;
}