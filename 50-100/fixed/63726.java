static int getTotalDaysInYearTillMonth(int y, int m) {
    int pos = y - (org.joda.time.chrono.BISDateUtils.FIRST_BIS_YEAR_SUPPORTED);
    int days = 0;
    for (int j = 0; j <= 12; ++j) {
        if (j == (m - 1))
            break;
        
        days = days + (org.joda.time.chrono.BISDateUtils.data[pos][j]);
    }
    return days;
}