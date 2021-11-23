@java.lang.Override
public double getIntersection(RayTracing.Ray ray) {
    double vd = RayTracing.VectorOperations.dotProduct(normal, ray.getV());
    if (vd == 0) {
        return -1;
    }
    double v0 = RayTracing.VectorOperations.dotProduct(normal, ray.getP0());
    double t = (((-1) * v0) + (offset)) / vd;
    if (t < 0) {
        return -1;
    }
    return t;
}