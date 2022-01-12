@org.junit.Test
public void testSubmitReservationValidRecurrenceExpression() {
    org.apache.hadoop.yarn.api.protocolrecords.ReservationSubmissionRequest request = createSimpleReservationSubmissionRequest(1, 1, 1, 5, 3, "600000");
    org.apache.hadoop.yarn.server.resourcemanager.reservation.Plan plan = null;
    try {
        plan = rrValidator.validateReservationSubmissionRequest(rSystem, request, org.apache.hadoop.yarn.server.resourcemanager.reservation.ReservationSystemTestUtil.getNewReservationId());
    } catch (org.apache.hadoop.yarn.exceptions.YarnException e) {
        org.junit.Assert.fail(e.getMessage());
    }
    org.junit.Assert.assertNotNull(plan);
}