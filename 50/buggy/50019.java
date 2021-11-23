private int getWindowStartHourMin() {
    return getHourMin(window.getHourOfDayInUTC(), window.getMinuteOfHourInUTC());
}