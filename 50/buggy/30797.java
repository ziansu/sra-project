@org.junit.Test
public void listAllSegmentEfforts_privateSegmentOtherUser() {
    java.util.List<javastrava.api.v3.model.StravaSegmentEffort> efforts = service().listAllSegmentEfforts(TestUtils.SEGMENT_OTHER_USER_PRIVATE_ID);
    org.junit.Assert.assertNull(efforts);
}