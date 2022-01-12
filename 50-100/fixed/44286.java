public void print(final com.valkryst.VTerminal.component.Screen screen, java.awt.Point[] points) {
    java.util.Objects.requireNonNull(screen);
    java.util.Objects.requireNonNull(points);
    if ((points.length) < 3) {
        throw new java.lang.IllegalArgumentException("A triangle requires three points to be drawn.");
    }
    points = new java.awt.Point[]{ points[0] , points[1] , points[2] , points[0] };
    linePrinter.print(screen, points);
}