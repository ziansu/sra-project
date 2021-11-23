private int getWindowStartHourMin() {
    int hour = ((window.getHourOfDayInUTC()) != null) ? window.getHourOfDayInUTC() : 0;
    int minute = ((window.getMinuteOfHourInUTC()) != null) ? window.getMinuteOfHourInUTC() : 0;
    return getHourMin(hour, minute);
}