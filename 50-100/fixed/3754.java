@org.junit.Test
public void testSignMultipleApksOverwrite() throws java.lang.Exception {
    java.util.List<java.io.File> uApks = at.favre.tools.apksigner.SignToolTest.copyToTestPath(originalFolder, unsingedApks);
    java.lang.String cmd = (((("-" + (at.favre.tools.apksigner.ui.CLIParser.ARG_APK_FILE)) + " ") + (originalFolder.getAbsolutePath())) + " --overwrite --") + (at.favre.tools.apksigner.ui.CLIParser.ARG_SKIP_ZIPALIGN);
    at.favre.tools.apksigner.SignToolTest.testAndCheck(cmd, null, originalFolder, uApks);
}