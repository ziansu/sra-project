@org.junit.Test
@org.openmrs.test.Verifies(value = "should return obs whose groupId is given obsGroupId", method = "getObservations(List,List,List,List,List,List,List,Integer,Integer,Date,Date,boolean,String)")
public void getObservations_shouldReturnObsWhoseGroupIdIsGivenObsGroupId() throws java.lang.Exception {
    executeDataSet(org.openmrs.api.ObsServiceTest.INITIAL_OBS_XML);
    org.openmrs.api.ObsService obsService = org.openmrs.api.context.Context.getObsService();
    java.util.List<org.openmrs.Obs> obss = obsService.getObservations(null, null, null, null, null, null, null, null, 2, null, null, false, null);
    org.junit.Assert.assertEquals(1, obss.size());
}