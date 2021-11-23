public static java.lang.String getYearForHeavenlyStems(int year) {
    int position = (year - (n.calendarview.utils.EraUtils.INIT_YEAR)) % 10;
    return n.calendarview.utils.EraUtils.HEAVENLY_STEMS[position];
}