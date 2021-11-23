public void process(org.openstreetmap.osmosis.core.container.v0_6.WayContainer wayContainer) {
    org.openstreetmap.osmosis.core.domain.v0_6.Way way;
    long wayId;
    flushNodes(true);
    way = wayContainer.getEntity();
    wayId = way.getId();
    if (wayId >= (maxWayId)) {
        maxWayId = wayId + 1;
    }
    if (wayId < (minWayId)) {
        minWayId = wayId;
    }
    wayBuffer.add(way);
    flushWays(false);
}