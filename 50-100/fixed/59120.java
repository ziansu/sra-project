public geometry.Vector firstDerivative(double t) {
    double B0 = (1 - t) * (1 - t);
    double B1 = (2 * t) * (1 - t);
    double B2 = t * t;
    return new geometry.Vector(V1_V0.scale(B0).sum(V2_V1.scale(B1)).sum(V3_V2.scale(B2)).scale(3));
}