private static void drawPolygon(ch.fhnw.module01.Turtle t, int x, int y, int edges, int edgeLength) {
    t.moveTo(x, y);
    t.down();
    double angle = 360.0 / ((double) (edges));
    for (int i = 1; i <= edges; i++) {
        t.move(edgeLength);
        t.right(angle);
    }
    t.up();
}