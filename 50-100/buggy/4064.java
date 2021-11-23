protected final void draw(java.awt.Graphics2D g2d) {
    if (geo.isLaTeX())
        geogebra.euclidian.Drawable.drawMultilineLaTeX(view.getApplication(), tempGraphics, geo, g2d, font, java.awt.Color.BLACK, java.awt.Color.WHITE, text, 0, 0);
    else
        geogebra.euclidian.Drawable.drawMultiLineIndexedText(view.getApplication(), text, 0, 0, g2d);
    
}