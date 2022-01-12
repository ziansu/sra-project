public static boolean intersectCircleCircle(org.joml.Vector2d centerA, double radiusSquaredA, org.joml.Vector2d centerB, double radiusSquaredB, org.joml.Vector3d intersectionCenterAndHL) {
    return org.joml.Intersectiond.intersectCircleCircle(centerA.x, centerA.y, radiusSquaredA, centerB.x, centerB.y, radiusSquaredB, intersectionCenterAndHL);
}