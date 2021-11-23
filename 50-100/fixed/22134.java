@org.junit.Test
public void testParseSketchEntryParsesSecondEntry() throws java.lang.Exception {
    java.lang.String simpleText = "blue 0 0 1 0";
    org.hwyl.sexytopo.model.sketch.PathDetail pathDetail = org.hwyl.sexytopo.control.io.thirdparty.xvi.XviImporter.parseSketchEntry(1, simpleText);
    junit.framework.Assert.assertEquals(new org.hwyl.sexytopo.model.graph.Coord2D(1, 0), pathDetail.getPath().get(1));
    junit.framework.Assert.assertEquals(2, pathDetail.getPath().size());
}