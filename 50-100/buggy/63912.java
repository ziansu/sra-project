public static double evaluateRastrigin(Vector2D z) {
    Vector2D v = Vector2D.subtractVectors(z, TestFunctions.rastriginShiftVector);
    double returnValue = 0;
    for (int i = 0; i < (v.size()); i++) {
        double xi = v.getValue(i);
        returnValue += ((xi * xi) - (10.0 * (java.lang.Math.cos(((2.0 * (java.lang.Math.PI)) * xi))))) + 10.0;
    }
    return returnValue;
}