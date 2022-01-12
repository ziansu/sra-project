private static double distance(edu.truman.amb1664.marchingbuddy.MarchingDot start, edu.truman.amb1664.marchingbuddy.MarchingDot end) {
    double startX = start.getLeftToRight();
    double startY = start.getFrontToBack();
    double endX = end.getLeftToRight();
    double endY = end.getFrontToBack();
    return java.lang.Math.sqrt(((java.lang.Math.pow((endX - startX), 2)) + (java.lang.Math.pow((endY - startY), 2))));
}