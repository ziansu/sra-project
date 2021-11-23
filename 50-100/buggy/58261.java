static double calcRadAngle(Vector a, Vector b) {
    double c = (((a.dx) * (b.dx)) + ((a.dy) * (b.dy))) / ((a.length) * (b.length));
    c = Tool.correctDouble(c);
    if ((c > 1) && ((c - 1) < 1.0E-4))
        c = 1.0;
    
    return Tool.correctDouble(java.lang.Math.acos(c));
}