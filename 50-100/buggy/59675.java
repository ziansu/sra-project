@org.junit.Test
public void testStartBeforeEndAfterBusinessDay() {
    double charge = bcccp.carpark.ChargeCalculator.calcDayCharge(java.time.LocalTime.of(4, 0, 3), java.time.LocalTime.of(23, 0, 0), java.time.DayOfWeek.MONDAY);
    double outOfHours = ((3 * 60) * 2) + ((4 * 60) * 2);
    double businessHours = (12 * 60) * 5;
    assertEquals((outOfHours + businessHours), charge, test.bcccp.carpark.ChargeCalculatorTest.DELTA);
}