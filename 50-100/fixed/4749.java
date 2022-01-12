public static long hashSpeedNode(float vx, MarioAI.graph.edges.DirectedEdge edge) {
    final long a = ((long) (MarioAI.Hasher.hashSpeed(vx, MarioAI.Hasher.FACTOR_NUMBER_OF_SPEED_NODES))) << 32;
    final long edgeHash = edge.hashCode();
    return a | edgeHash;
}