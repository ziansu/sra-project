public CharProperty getCharProperties(java.awt.Graphics g, java.lang.String c) {
    CharProperty prop = new CharProperty();
    if (c.isEmpty())
        return prop;
    
    java.awt.Rectangle bound = getStringBounds(g, c);
    prop.width = (bound.width) + 2;
    prop.height = g.getFontMetrics().getHeight();
    prop.advance = g.getFontMetrics().stringWidth(c);
    prop.ascent = g.getFontMetrics().getAscent();
    prop.bearing = leftSideBearing(g, c);
    return prop;
}