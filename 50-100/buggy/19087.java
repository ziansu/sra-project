@org.junit.Test
public void testParseSketchEntryParsesFirstEntry() throws java.lang.Exception {
    java.lang.String simpleText = "red 0 0";
    org.hwyl.sexytopo.model.sketch.PathDetail pathDetail = org.hwyl.sexytopo.control.io.thirdparty.xvi.XviImporter.parseSketchEntry(simpleText);
    junit.framework.Assert.assertEquals(Coord2D.ORIGIN, pathDetail.getPath().get(0));
    junit.framework.Assert.assertEquals(1, pathDetail.getPath().size());
}