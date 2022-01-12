@org.junit.Test
@org.openmrs.test.Verifies(value = "should return count of obs whose groupId is given obsGroupId", method = "getObservationCount(List,List,List,List,List,List,Integer,Date,Date,boolean,String)")
public void getObservationCount_shouldReturnCountOfObsWhoseGroupIdIsGivenObsGroupId() throws java.lang.Exception {
    executeDataSet(org.openmrs.api.ObsServiceTest.INITIAL_OBS_XML);
    org.openmrs.api.ObsService obsService = org.openmrs.api.context.Context.getObsService();
    java.lang.Integer count = obsService.getObservationCount(null, null, null, null, null, null, 2, null, null, false, null);
    org.junit.Assert.assertEquals(2, count.intValue());
}