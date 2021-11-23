private void validateAdd(java.awt.Polygon poly, int x, int y) {
    ij.gui.PointRoi tmp;
    p = new ij.gui.PointRoi(poly);
    org.junit.Assert.assertFalse(p.contains(x, y));
    tmp = p.addPoint(x, y);
    org.junit.Assert.assertTrue(tmp.contains(x, y));
}