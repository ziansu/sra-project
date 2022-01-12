public static com.oelballer.beerpong.math.Vector2f[] circleLineSegmentIntersection(com.oelballer.beerpong.math.Vector2f circlePosition, float radius, com.oelballer.beerpong.math.Vector2f segmentStart, com.oelballer.beerpong.math.Vector2f segmentEnd) {
    if ((segmentEnd.x) != (segmentStart.x))
        return com.oelballer.beerpong.math.Intersections.circleLineSolveForX(circlePosition, radius, segmentStart, segmentEnd);
    
    return com.oelballer.beerpong.math.Intersections.circleLineSolveForY(circlePosition, radius, segmentStart, segmentEnd);
}