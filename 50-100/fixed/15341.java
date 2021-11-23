boolean match(org.overmind.rects.Point point) {
    double sum = (((org.overmind.rects.AreaUtils.byThreePoints(a, b, point)) + (org.overmind.rects.AreaUtils.byThreePoints(b, c, point))) + (org.overmind.rects.AreaUtils.byThreePoints(c, d, point))) + (org.overmind.rects.AreaUtils.byThreePoints(a, d, point));
    return (java.lang.Math.abs((sum - (area)))) < (org.overmind.rects.Rectangle.E);
}