private static double distance(edu.truman.amb1664.marchingbuddy.MarchingDot start, edu.truman.amb1664.marchingbuddy.MarchingDot end) {
    double startX = java.lang.Math.abs(start.getLeftToRight());
    double startY = java.lang.Math.abs(start.getFrontToBack());
    double endX = java.lang.Math.abs(end.getLeftToRight());
    double endY = java.lang.Math.abs(end.getFrontToBack());
    return java.lang.Math.sqrt(((java.lang.Math.pow((endX - startX), 2)) + (java.lang.Math.pow((endY - startY), 2))));
}