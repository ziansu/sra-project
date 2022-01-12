public int getDifferenceFromPointToPlane(com.stikanek.math.Vec2 normalPlane, com.stikanek.math.Vec2 aabbCenter, com.stikanek.math.Vec2 aabbHalfExtent, com.stikanek.math.Vec2 point) {
    com.stikanek.math.Vec2 planeCenter = normalPlane.mul(aabbHalfExtent).addTo(aabbCenter);
    com.stikanek.math.Vec2 planeToPointDifference = point.sub(planeCenter);
    java.lang.System.out.println(((("planeToPointDifference x: " + (planeToPointDifference.getX())) + "y: ") + (planeToPointDifference.getY())));
    int difference = planeToPointDifference.dotProduct(normalPlane);
    java.lang.System.out.println(("difference: " + difference));
    return difference;
}