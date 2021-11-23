@org.junit.Test
public void testConstructIntProspectiveVersionWithRF2DeltaOnly() throws org.ihtsdo.otf.rest.exception.BusinessServiceException {
    validationConfig.setRf2DeltaOnly(true);
    prospectiveVersion = validationConfig.getRunId().toString();
    java.util.List<java.lang.String> filesLoaded = dataLoader.loadProspectiveDeltaWithPreviousSnapshotIntoDB(prospectiveVersion, validationConfig, null);
    org.junit.Assert.assertEquals(1, filesLoaded.size());
    org.junit.Assert.assertTrue(releaseDataManager.isKnownRelease(prospectiveVersion));
}