private boolean freezing(android.graphics.Point p1, android.graphics.Point p2) {
    return (threatening(p1, p2)) && (!(isSafe(p2)));
}