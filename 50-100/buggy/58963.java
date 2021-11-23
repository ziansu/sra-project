@org.junit.Test
public void testBeforeStartOfBusinessDay() {
    double charge = bcccp.carpark.ChargeCalculator.calcDayCharge(java.time.LocalTime.of(1, 0, 0), java.time.LocalTime.of(6, 59, 59), java.time.DayOfWeek.MONDAY);
    double minutes = (5 * 60) + 59;
    assertEquals((minutes * 2), charge, test.bcccp.carpark.ChargeCalculatorTest.DELTA);
}