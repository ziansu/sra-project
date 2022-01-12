private static void checkColor(java.awt.Color expected, org.apache.poi.sl.usermodel.PaintStyle actualStyle) {
    assertTrue((actualStyle instanceof org.apache.poi.sl.usermodel.PaintStyle.SolidPaint));
    org.apache.poi.sl.usermodel.PaintStyle.SolidPaint ps = ((org.apache.poi.sl.usermodel.PaintStyle.SolidPaint) (actualStyle));
    java.awt.Color actual = org.apache.poi.sl.draw.DrawPaint.applyColorTransform(ps.getSolidColor());
    float[] expRGB = expected.getRGBComponents(null);
    float[] actRGB = actual.getRGBComponents(null);
    assertArrayEquals(expRGB, actRGB, 1.0E-4F);
}