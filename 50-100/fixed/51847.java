public static boolean isThreatened(Field f, Point p, boolean white) {
    java.util.ArrayList<Point> l = Logic.attackedFields(f, (!white));
    for (Point x : l) {
        if (x.equals(p)) {
            return true;
        }
    }
    return false;
}