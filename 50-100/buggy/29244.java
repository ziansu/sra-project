public static java.util.List<java.awt.Point> getFilledRectangle(final int x, final int y, final int width, final int height) {
    final java.util.List<java.awt.Point> points = new java.util.ArrayList<>();
    for (int xCounter = x; xCounter < width; xCounter++) {
        for (int yCounter = y; yCounter < height; yCounter++) {
            points.add(new java.awt.Point(xCounter, yCounter));
        }
    }
    return points;
}