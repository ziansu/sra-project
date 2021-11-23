private void normalizePoints(java.util.Vector<java.awt.Point> vector, java.awt.Point extremePoint) {
    vector.forEach(( point) -> {
        point.x += java.lang.Math.abs(extremePoint.x);
        point.x *= dimensionRatio;
        point.y += java.lang.Math.abs(extremePoint.y);
        point.y *= dimensionRatio;
        point.y = ((int) (window.getHeight())) - (point.y);
    });
}