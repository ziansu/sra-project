private int estimatePlainWidth(org.geogebra.common.awt.GGraphics2D g2, int cols) {
    org.geogebra.common.awt.font.GTextLayout layout = getLayout(g2, getWidthestPlainItem(), optionFont);
    double w = ((layout.getBounds().getWidth()) + (2 * (getOptionsItemHGap()))) * cols;
    return ((int) (w));
}