@org.junit.Test
public void testSignMultiApkWithZipalign() throws java.lang.Exception {
    java.util.List<java.io.File> uApks = at.favre.tools.apksigner.SignToolTest.copyToTestPath(originalFolder, unsingedApks);
    java.lang.String cmd = ((((((("-" + (at.favre.tools.apksigner.ui.CLIParser.ARG_APK_FILE)) + " ") + (originalFolder.getAbsolutePath())) + " -") + (at.favre.tools.apksigner.ui.CLIParser.ARG_APK_OUT)) + " ") + (outFolder.getAbsolutePath())) + " --debug";
    at.favre.tools.apksigner.SignToolTest.testAndCheck(cmd, originalFolder, outFolder, uApks);
}