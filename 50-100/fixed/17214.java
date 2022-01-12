private void setLeftPoints(java.awt.Graphics2D g2d) {
    xPoints[0] = horizontal;
    yPoints[0] = vertical;
    xPoints[1] = horizontal;
    yPoints[1] = (vertical) + 20;
    xPoints[2] = (horizontal) + 20;
    yPoints[2] = (vertical) + 10;
    for (int i = 0; i < (xPoints.length); i++) {
        xPoints[i] = (xPoints[i]) + 20;
    }
}