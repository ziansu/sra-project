public void markEdgeJunction(int edgeId, long osmNodeId1, long osmNodeId2) {
    byte junction1 = ((junctionWayCount.get(osmNodeId1)) > 2) ? junctionType.get(osmNodeId1) : 0;
    byte junction2 = ((junctionWayCount.get(osmNodeId2)) > 2) ? junctionType.get(osmNodeId2) : 0;
    int junctionSignature = junction1 | (junction2 << 8);
    edgeJunctionSignature.put(edgeId, junctionSignature);
}