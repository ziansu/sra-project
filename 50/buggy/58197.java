@org.junit.Test
public void testGetDrawGrid() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    jmri.jmrit.display.layoutEditor.LayoutEditor e = new jmri.jmrit.display.layoutEditor.LayoutEditor();
    org.junit.Assert.assertFalse("getDrawGrid", e.getDrawGrid());
    e.dispose();
}