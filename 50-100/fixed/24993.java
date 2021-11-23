private static uk.me.mjt.ch.DirectedEdge makeEdgeAndAddToNodes(long edgeId, uk.me.mjt.ch.Node from, uk.me.mjt.ch.Node to, int driveTimeMs, uk.me.mjt.ch.AccessOnly accessOnly) {
    uk.me.mjt.ch.Preconditions.checkNoneNull(from, to);
    uk.me.mjt.ch.DirectedEdge de = new uk.me.mjt.ch.DirectedEdge(edgeId, from, to, driveTimeMs, accessOnly);
    from.edgesFrom.add(de);
    to.edgesTo.add(de);
    return de;
}