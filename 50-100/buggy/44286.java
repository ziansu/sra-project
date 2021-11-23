public void print(final com.valkryst.VTerminal.component.Screen screen, java.awt.Point[] points) {
    java.util.Objects.requireNonNull(screen);
    java.util.Objects.requireNonNull(points);
    if ((points.length) < 3) {
        throw new java.lang.IllegalArgumentException("A triangle requires three points to be drawn.");
    }
    if ((points.length) > 3) {
        points = new java.awt.Point[]{ points[0] , points[1] , points[2] };
    }
    linePrinter.print(screen, points);
}