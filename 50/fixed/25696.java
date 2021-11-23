@org.junit.Test
public void whenEndDateIsLowerBarTimePlusPeriodInterval() {
    endDateForBar = ((barTime) + (periodInterval)) - 1;
    subscribe().assertValue(((endDateForBar) - (periodInterval)));
}