@org.junit.Test
public void exportBasicTmx() throws java.io.IOException, java.net.URISyntaxException {
    final com.vistatec.ocelot.segment.model.OcelotSegment testSeg = new com.vistatec.ocelot.segment.model.SimpleSegment.Builder().segmentNumber(1).source("plain text").target("target plain text").build();
    setupTmxWriter(testSeg);
    tmxWriter.setOpenFileLangs(new com.vistatec.ocelot.events.OpenFileEvent("export_tmx_test", LocaleId.ENGLISH.getLanguage(), LocaleId.FRENCH.getLanguage()));
    tmxWriter.exportTmx(testFile);
    com.vistatec.ocelot.tm.okapi.TestOkapiTmxWriter.assertExportedTmxFilesEqual(com.google.common.io.Files.asByteSource(testFile), com.vistatec.ocelot.tm.okapi.TestOkapiTmxWriter.class.getResourceAsStream("export_tmx_test_goal.tmx"));
}