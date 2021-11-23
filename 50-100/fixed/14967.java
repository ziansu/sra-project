@java.lang.Override
protected void checkMoveValidity(com.github.rinde.rinsim.geom.Point objLoc, com.github.rinde.rinsim.geom.Point nextHop) {
    super.checkMoveValidity(objLoc, nextHop);
    if (!(objLoc.equals(nextHop))) {
        final com.github.rinde.rinsim.geom.Connection<?> conn = getConnection(objLoc, nextHop);
        if ((graph.hasConnection(conn.to(), conn.from())) && (registry().hasRoadUserOn(conn.to(), conn.from()))) {
            throw new com.github.rinde.rinsim.core.model.road.DeadlockException(conn);
        }
    }
}