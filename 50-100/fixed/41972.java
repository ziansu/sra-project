private static org.apache.commons.math3.geometry.euclidean.threed.Vector3D segPoint(double angle, double z, double w, double h, double x, double y) {
    return new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((-(java.lang.Math.cos(angle))) * w) + x), (((java.lang.Math.sin(angle)) * h) + y), z);
}