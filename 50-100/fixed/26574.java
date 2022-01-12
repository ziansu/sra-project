@org.junit.Test
public void testAfterEndOfBusinessDay() {
    double charge = bcccp.carpark.ChargeCalculator.calcDayCharge(java.time.LocalTime.of(19, 0, 1), java.time.LocalTime.of(20, 0, 1), java.time.DayOfWeek.MONDAY);
    assertEquals(((60 * 2) / 60), charge, test.bcccp.carpark.ChargeCalculatorTest.DELTA);
}