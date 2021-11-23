@org.junit.Test
public void publishFlight() throws java.lang.Exception {
    res = flightService.publishFlight("BJ1001");
    org.junit.Assert.assertEquals(res.isStatus(), false);
    org.junit.Assert.assertEquals(res.getMsg(), com.airline.utils.Constant.reply.getFlightNoFlight());
    res = flightService.publishFlight("AAA170512-BJ1001");
    org.junit.Assert.assertEquals(res.isStatus(), true);
}