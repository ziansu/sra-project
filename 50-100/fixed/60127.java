@org.junit.Test
public void getCovariateTestData() throws org.drugis.addis.trialverse.service.impl.ReadValueException {
    java.lang.String namespaceUid = "namespaceUid";
    java.lang.String version = "version";
    java.lang.String mockResult = org.drugis.addis.TestUtils.loadResource(this.getClass(), "/triplestoreService/covariateDataExample.json");
    createMockTrialverseService(mockResult);
    java.util.List<org.drugis.addis.trialverse.CovariateStudyValue> result = triplestoreService.getStudyLevelCovariateValues(namespaceUid, version, java.util.Arrays.asList(CovariateOption.ALLOCATION_RANDOMIZED));
    assertEquals(4, result.size());
}