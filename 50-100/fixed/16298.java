public double getDistance(android.graphics.Point a, android.graphics.Point b) {
    double temp = (((a.x) - (b.x)) * ((a.x) - (b.x))) + (((a.y) - (b.y)) * ((a.y) - (b.y)));
    double result = java.lang.Math.sqrt(temp);
    return result;
}