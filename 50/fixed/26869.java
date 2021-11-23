protected java.util.Set<util.Coords> getEmptyIntersections() {
    java.util.Set<util.Coords> emptyIntersections = getAllIntersections();
    emptyIntersections.removeAll(getLiveBlackStones());
    emptyIntersections.removeAll(getLiveWhiteStones());
    return emptyIntersections;
}