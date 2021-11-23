@org.junit.Test
public void testSubmitReservationNegativeRecurrenceExpression() {
    org.apache.hadoop.yarn.api.protocolrecords.ReservationSubmissionRequest request = createSimpleReservationSubmissionRequest(1, 1, 1, 5, 3, "-1234");
    plan = null;
    try {
        plan = rrValidator.validateReservationSubmissionRequest(rSystem, request, org.apache.hadoop.yarn.server.resourcemanager.reservation.ReservationSystemTestUtil.getNewReservationId());
        org.junit.Assert.fail();
    } catch (org.apache.hadoop.yarn.exceptions.YarnException e) {
        org.junit.Assert.assertNull(plan);
        java.lang.String message = e.getMessage();
        org.junit.Assert.assertTrue(message.startsWith("Negative Period : "));
        org.apache.hadoop.yarn.server.resourcemanager.reservation.TestReservationInputValidator.LOG.info(message);
    }
}