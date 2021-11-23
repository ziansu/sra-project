@com.graph.Test
public void yPixToData() {
    assertEquals("minimum", ((yCenter) - ((yScale) / 2)), sub.yPixToData(height), DELTA);
    assertEquals("center", yCenter, sub.yPixToData(((height) / 2)), DELTA);
    assertEquals("maximum", ((yCenter) + ((yScale) / 2)), sub.yPixToData(0), DELTA);
}