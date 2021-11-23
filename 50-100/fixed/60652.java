@com.graph.Test
public void yDataToPix() {
    assertEquals("pixel 0", 0, sub.yDataToPix(((yCenter) + ((yScale) / 2))));
    assertEquals("pixel height/2", ((height) / 2), sub.yDataToPix(yCenter));
    assertEquals("pixel height", height, sub.yDataToPix(((yCenter) - ((yScale) / 2))));
}