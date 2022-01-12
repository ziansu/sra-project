@java.lang.Override
public void drawShape(int x, int y) {
    float smallThickness = (diameter) / (pixelitor.tools.brushes.WobbleBrush.SIZE_DIVIDING_FACTOR);
    if ((diameter) != (lastDiameter)) {
        lastStroke = new com.jhlabs.awt.WobbleStroke(0.5F, smallThickness, smallThickness);
    }
    targetG.setStroke(lastStroke);
    java.awt.Shape circle = new java.awt.geom.Ellipse2D.Float(x, y, 0.1F, 0.1F);
    targetG.draw(circle);
}