@java.lang.Override
public double getIntersection(RayTracing.Ray ray) {
    double vd = RayTracing.VectorOperations.dotProduct(normal, ray.getV());
    if (vd == 0) {
        return -1;
    }
    double v0 = (-1) * (RayTracing.VectorOperations.dotProduct(normal, RayTracing.VectorOperations.add(ray.getP0(), new RayTracing.Vector(offset, offset, offset))));
    double t = v0 / vd;
    if (t < 0) {
        return -1;
    }
    return t;
}