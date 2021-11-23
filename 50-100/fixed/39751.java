private static int daysInPriorYears(int yr, boolean use1904windowing) {
    if (((!use1904windowing) && (yr < 1900)) || (use1904windowing && (yr < 1904))) {
        throw new java.lang.IllegalArgumentException("'year' must be 1900 or greater");
    }
    int yr1 = yr - 1;
    int leapDays = (((yr1 / 4) - (yr1 / 100)) + (yr1 / 400)) - 460;
    return (365 * (yr - (use1904windowing ? 1904 : 1900))) + leapDays;
}