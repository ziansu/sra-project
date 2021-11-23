private static java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> withoutDominated(java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> points, com.cliffcrosland.kirkpatrickseidel.Point2 maximum) {
    java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> ret = new java.util.ArrayList<com.cliffcrosland.kirkpatrickseidel.Point2>();
    for (com.cliffcrosland.kirkpatrickseidel.Point2 point : points) {
        if (((maximum.x) > (point.x)) && ((maximum.y) > (point.y))) {
            ret.add(point);
        }
    }
    return ret;
}