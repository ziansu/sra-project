public static int getMinutesForTimerDisplayedValue(int timerPickerValue) {
    if ((timerPickerValue > 0) && (timerPickerValue < (com.doruchidean.clujbikemap.helpers.GeneralHelper.TIMER_VALUES.length))) {
        return com.doruchidean.clujbikemap.helpers.GeneralHelper.TIMER_VALUES[timerPickerValue];
    }else {
        return com.doruchidean.clujbikemap.helpers.GeneralHelper.TIMER_VALUES[2];
    }
}