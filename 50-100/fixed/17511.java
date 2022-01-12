private static java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> withoutDominated(java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> points, com.cliffcrosland.kirkpatrickseidel.Point2 maximum) {
    java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> ret = new java.util.ArrayList<>();
    for (com.cliffcrosland.kirkpatrickseidel.Point2 point : points) {
        if (((maximum.x) >= (point.x)) && ((maximum.y) >= (point.y))) {
            continue;
        }
        ret.add(point);
    }
    return ret;
}