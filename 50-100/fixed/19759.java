@org.junit.Test
public void testAddFileSet() throws java.lang.Exception {
    java.io.File report = new java.io.File("target/dependency-check-report.html");
    if ((report.exists()) && (!(report.delete()))) {
        throw new java.lang.Exception("Unable to delete 'target/DependencyCheck-Report.html' prior to test.");
    }
    buildFileRule.executeTarget("test.fileset");
    org.junit.Assert.assertTrue("DependencyCheck report was not generated", report.exists());
}