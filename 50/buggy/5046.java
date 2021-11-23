public boolean isOverlappingSolid() {
    java.util.stream.Stream<objects.world.WorldObject> solids = getOverlappingSolids();
    java.util.Iterator<objects.world.WorldObject> is = solids.iterator();
    return (solids == null) || (is.hasNext());
}