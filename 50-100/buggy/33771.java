@org.junit.Test
public void noBuildDefaultsToMaven() throws java.lang.Exception {
    com.ibm.liberty.starter.ProjectConstructionInputData result = testObject.processInput(new java.lang.String[]{  }, new java.lang.String[]{  }, "wibble", "local", "wibble", null);
    org.junit.Assert.assertThat(result.buildType, org.hamcrest.CoreMatchers.is(ProjectConstructor.BuildType.MAVEN));
}