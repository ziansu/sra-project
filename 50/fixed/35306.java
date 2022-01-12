public static double anguloAbsoluto(double xOrigen, double yOrigen, double xDestino, double yDestino) {
    double offsetX = xDestino - xOrigen;
    double offsetY = yDestino - yOrigen;
    return java.lang.Math.toDegrees(java.lang.Math.atan2(offsetY, offsetX));
}