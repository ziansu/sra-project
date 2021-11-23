public int getDifferenceFromPointToPlane(com.stikanek.math.Vec2 normalPlane, com.stikanek.math.Vec2 aabbCenter, com.stikanek.math.Vec2 aabbHalfExtent, com.stikanek.math.Vec2 point) {
    com.stikanek.math.Vec2 planeCenter = normalPlane.mul(aabbHalfExtent).addTo(aabbCenter);
    com.stikanek.math.Vec2 planeToPointDifference = point.sub(planeCenter);
    int difference = planeToPointDifference.dotProduct(normalPlane);
    return difference;
}