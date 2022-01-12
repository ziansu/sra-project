public static double evaluateSphere(Vector2D z) {
    Vector2D v = Vector2D.subtractVectors(z, TestFunctions.sphereShiftVector);
    double sumOfSquares = 0.0;
    for (int i = 0; i < (v.size()); i++) {
        double xi = v.getValue(i);
        sumOfSquares += xi * xi;
    }
    return sumOfSquares;
}