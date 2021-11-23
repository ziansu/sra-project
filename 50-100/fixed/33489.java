public static com.oelballer.beerpong.math.Vector2f[] circleLineSegmentIntersection(com.oelballer.beerpong.math.Vector2f circlePosition, float radius, com.oelballer.beerpong.math.Vector2f segmentStart, com.oelballer.beerpong.math.Vector2f segmentEnd) {
    boolean diff = (java.lang.Math.abs(((segmentEnd.x) - (segmentStart.x)))) > (java.lang.Math.abs(((segmentEnd.y) - (segmentStart.y))));
    if (diff)
        return com.oelballer.beerpong.math.Intersections.circleLineSolveForX(circlePosition, radius, segmentStart, segmentEnd);
    
    return com.oelballer.beerpong.math.Intersections.circleLineSolveForY(circlePosition, radius, segmentStart, segmentEnd);
}