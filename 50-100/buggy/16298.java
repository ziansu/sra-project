public double getDistance(android.graphics.Point a, android.graphics.Point b) {
    try {
        return java.lang.Math.sqrt(((((a.x) - (b.x)) * ((a.x) - (b.x))) + (((a.y) - (b.y)) * ((a.y) - (b.y)))));
    } catch (java.lang.Exception e) {
        return 0;
    }
}