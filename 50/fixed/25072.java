@org.junit.Test(expected = com.tsystems.jschool.railage.service.exceptions.IncorrectTimeFormatException.class)
@org.junit.Ignore(value = "needs changes")
public void testValidateTimes2() throws java.lang.Exception {
    params.setTimes(java.util.Arrays.asList("8:07", "09:08", "19:00", "24:30"));
}