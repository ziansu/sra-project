private java.lang.String computeHourToWakeUp(ar.com.espherika.keyboard.ReplyKeyboardSleep.SLEEP_WELL_STATE state, java.lang.String hour) throws java.text.ParseException {
    java.lang.String computedHour;
    if (state.equals(SLEEP_WELL_STATE.WAIT_INCREASE_HOUR)) {
        computedHour = ar.com.espherika.utils.Time24HoursUtils.increase(hour, 2);
    }else {
        if (state.equals(SLEEP_WELL_STATE.WAIT_DECREASE_HOUR)) {
            computedHour = ar.com.espherika.utils.Time24HoursUtils.increase(hour, (-2));
        }else {
            computedHour = hour;
        }
    }
    return computedHour;
}