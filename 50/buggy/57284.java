@org.junit.Test(expected = com.tsystems.jschool.railage.service.exceptions.IncorrectStationsDepartureTimesOrderException.class)
public void testValidateTimes7() throws java.lang.Exception {
    params.setTimes(java.util.Arrays.asList("8:07", "8:07", "19:00", "20:30"));
    params.validateTimes();
}