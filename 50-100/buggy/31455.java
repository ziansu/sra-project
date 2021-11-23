@org.junit.Test
public void invalidBuildDefaultsToMaven() throws java.lang.Exception {
    com.ibm.liberty.starter.ProjectConstructionInputData result = testObject.processInput(new java.lang.String[]{  }, new java.lang.String[]{  }, "wibble", "local", "wibble", "wibble");
    org.junit.Assert.assertThat(result.buildType, org.hamcrest.CoreMatchers.is(ProjectConstructor.BuildType.MAVEN));
}