@org.junit.Test
public void isHoldingRequest() {
    getRequestLapseWithNoHold();
    final long timeLapseRegularRequest = getRequestLapseWithNoHold();
    final long timeLapseRequestWithHold = getRequestLapseWithHold();
    final long regularRequestWithHoldTime = timeLapseRegularRequest + (test.com.uaihebert.uaimockserver.validation.HoldTheRequestTest.MIN_TIME_WAITTING);
    org.junit.Assert.assertTrue(java.lang.String.format(test.com.uaihebert.uaimockserver.validation.HoldTheRequestTest.ASSERTING_TEXT, timeLapseRequestWithHold, regularRequestWithHoldTime), (timeLapseRequestWithHold >= regularRequestWithHoldTime));
}