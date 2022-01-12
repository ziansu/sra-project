@org.junit.Test
public void releaseNotesAreGeneratedByTagWithPushOfReleaseNotes() throws java.io.IOException {
    final java.lang.String[] args = new java.lang.String[]{ "-configurationFilePath" , com.infusion.relnotesgen.MainIT.class.getResource("/configuration.properties").getFile() , "-pushReleaseNotes" , "-reportDirectory" , com.infusion.relnotesgen.MainIT.reportDirectory.getAbsolutePath() };
    com.infusion.relnotesgen.Main.main(args);
    org.junit.Assert.assertTrue(com.infusion.relnotesgen.MainIT.getReport().exists());
}