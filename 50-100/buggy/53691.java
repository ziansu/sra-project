@org.junit.Test
public void testOutOfHoursPartDay() {
    double charge = bcccp.carpark.ChargeCalculator.calcDayCharge(java.time.LocalTime.of(1, 10, 27), java.time.LocalTime.of(19, 15, 17), java.time.DayOfWeek.SATURDAY);
    double minutesExpected = (18 * 60) + 5;
    assertEquals((minutesExpected * 2), charge, test.bcccp.carpark.ChargeCalculatorTest.DELTA);
}