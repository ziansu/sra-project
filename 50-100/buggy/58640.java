public static boolean intersectCircleCircle(org.joml.Vector2f centerA, float radiusSquaredA, org.joml.Vector2f centerB, float radiusSquaredB, org.joml.Vector3f intersectionCenterAndHL) {
    return org.joml.Intersectionf.intersectCircleCircle(centerA.x, centerA.y, radiusSquaredB, centerB.x, centerB.y, radiusSquaredB, intersectionCenterAndHL);
}