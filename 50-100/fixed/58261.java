static double calcRadAngle(Vector a, Vector b) {
    double c = (((a.dx) * (b.dx)) + ((a.dy) * (b.dy))) / ((a.length) * (b.length));
    c = Tool.correctDouble(c);
    return Tool.correctDouble(java.lang.Math.acos(c));
}