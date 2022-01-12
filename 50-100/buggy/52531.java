@org.junit.Test
public void testExactlyDuringBusinessDay() {
    double charge = bcccp.carpark.ChargeCalculator.calcDayCharge(java.time.LocalTime.of(7, 0, 0), java.time.LocalTime.of(19, 0, 0), java.time.DayOfWeek.MONDAY);
    assertEquals(((12 * 60) * 5), charge, test.bcccp.carpark.ChargeCalculatorTest.DELTA);
}