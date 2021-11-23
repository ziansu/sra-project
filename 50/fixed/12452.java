@org.junit.Test
public void testSimpleProjectReasoningValid() {
    java.lang.String projectName = "SimpleReasoningTest_Valid";
    java.io.File projectFolder = new java.io.File(AllTests.REASONINGS_DIR, projectName);
    net.ssehub.easy.standalone.ReasoningTests.checkValidity(projectFolder, null, null, false);
}