@org.junit.Test
public void testGetLastBuildWorksOnMaster() {
    int buildId = 207455891;
    fr.inria.spirals.jtravis.entities.Build currentBuild = fr.inria.spirals.jtravis.helpers.BuildHelper.getBuildFromId(207455891, null);
    int expectedBuildId = 207113449;
    fr.inria.spirals.jtravis.entities.Build obtainedBuild = fr.inria.spirals.jtravis.helpers.BuildHelper.getLastBuildOfSameBranchOfStatusBeforeBuild(currentBuild, null);
    org.junit.Assert.assertTrue((obtainedBuild != null));
    org.junit.Assert.assertEquals(expectedBuildId, obtainedBuild.getId());
}