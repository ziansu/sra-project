protected final java.awt.geom.Rectangle2D getBounds() {
    if (geo.isLaTeX())
        return geogebra.euclidian.Drawable.drawMultilineLaTeX(view.getApplication(), tempGraphics, geo, tempGraphics, font, java.awt.Color.BLACK, java.awt.Color.WHITE, text, 0, 0);
    else
        return geogebra.euclidian.Drawable.drawMultiLineIndexedText(view.getApplication(), text, 0, 0, tempGraphics);
    
}