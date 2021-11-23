@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testParseSketchEntryFailsForUnknownFirstCommand() throws java.lang.Exception {
    java.lang.String simpleText = "connect 0 0";
    org.hwyl.sexytopo.model.sketch.PathDetail pathDetail = org.hwyl.sexytopo.control.io.thirdparty.xvi.XviImporter.parseSketchEntry(simpleText);
}