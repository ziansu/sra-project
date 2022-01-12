@org.junit.Test
public void testNoApksGiven() throws java.lang.Exception {
    at.favre.tools.apksigner.SignToolTest.copyToTestPath(originalFolder, java.util.Collections.singletonList(testReleaseKs));
    java.lang.String cmd = (((((((("-" + (at.favre.tools.apksigner.ui.CLIParser.ARG_APK_FILE)) + " ") + (originalFolder.getAbsolutePath())) + " -") + (at.favre.tools.apksigner.ui.CLIParser.ARG_APK_OUT)) + " ") + (outFolder.getAbsolutePath())) + " --") + (at.favre.tools.apksigner.ui.CLIParser.ARG_SKIP_ZIPALIGN);
    at.favre.tools.apksigner.SignToolTest.testAndCheck(cmd, null, outFolder, java.util.Collections.emptyList());
}