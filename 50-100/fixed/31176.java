private static void generateWind() {
    java.util.Random rand = new java.util.Random();
    semestralka.ActuallyUsefulLine line = new semestralka.ActuallyUsefulLine();
    line.setAngle((360.0 * (rand.nextDouble())));
    line.setLength(((rand.nextDouble()) * (semestralka.Main.MAX_WIND)));
    semestralka.Main.wind = new java.awt.geom.Point2D.Double(line.p2.x, line.p2.y);
}