@org.junit.Test
public void testShade_withBelowZeroShadeFactor() {
    final java.awt.Color color = new java.awt.Color(255, 255, 255);
    final java.awt.Color shadedColor = com.valkryst.VTerminal.misc.ColorFunctions.shade(color, (-1));
    org.junit.Assert.assertEquals(color, shadedColor);
}