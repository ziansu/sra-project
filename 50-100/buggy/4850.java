private static com.cliffcrosland.kirkpatrickseidel.Point2 findMax(java.util.List<com.cliffcrosland.kirkpatrickseidel.Point2> points, java.util.Comparator<com.cliffcrosland.kirkpatrickseidel.Point2> comp) {
    com.cliffcrosland.kirkpatrickseidel.Point2 max = null;
    for (com.cliffcrosland.kirkpatrickseidel.Point2 point : points) {
        if ((max == null) || ((comp.compare(point, max)) < 0)) {
            max = point;
        }
    }
    return max;
}