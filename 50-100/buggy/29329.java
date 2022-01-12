public static boolean intersectSphereSphere(org.joml.Vector3f centerA, float radiusSquaredA, org.joml.Vector3f centerB, float radiusSquaredB, org.joml.Vector4f centerAndRadiusOfIntersectionCircle) {
    return org.joml.Intersectionf.intersectSphereSphere(centerA.x, centerA.y, centerA.z, radiusSquaredB, centerB.x, centerB.y, centerB.z, radiusSquaredB, centerAndRadiusOfIntersectionCircle);
}