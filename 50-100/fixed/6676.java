public double getNumSteps(android.graphics.Point p1, android.graphics.Point p2, int stepSize) {
    int x = (p2.x) - (p1.x);
    int y = (p2.y) - (p1.y);
    double distance = (java.lang.Math.abs(java.lang.Math.sqrt(((x * x) + (y * y))))) / (player.getScale());
    android.util.Log.i("Distance between p1/p2", ("" + distance));
    return distance / stepSize;
}