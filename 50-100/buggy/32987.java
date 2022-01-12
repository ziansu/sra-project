public double distanceTo(ru.job4j.condition.Point point) {
    int exponent = 2;
    double distance = java.lang.Math.sqrt(((java.lang.Math.pow(((this.x) - (point.x)), exponent)) + (java.lang.Math.pow(((this.y) - (point.y)), exponent))));
    return distance;
}