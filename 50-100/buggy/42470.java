public static boolean intersectSphereSphere(org.joml.Vector3d centerA, double radiusSquaredA, org.joml.Vector3d centerB, double radiusSquaredB, org.joml.Vector4d centerAndRadiusOfIntersectionCircle) {
    return org.joml.Intersectiond.intersectSphereSphere(centerA.x, centerA.y, centerA.z, radiusSquaredB, centerB.x, centerB.y, centerB.z, radiusSquaredB, centerAndRadiusOfIntersectionCircle);
}