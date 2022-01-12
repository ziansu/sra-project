public static int set(double[] dv, int offs, double x, double y, double r) {
    offs += org.jsl.cde.Body.Point.set(dv, offs, x, y);
    dv[offs] = r;
    return offs + 1;
}