public static long hashSpeedNode(float vx, MarioAI.graph.edges.DirectedEdge edge) {
    final int speedHash = MarioAI.Hasher.hashSpeed(vx, MarioAI.Hasher.FACTOR_NUMBER_OF_SPEED_NODES);
    final long speedSign = (speedHash >= 0) ? 0 : java.lang.Long.MIN_VALUE;
    final long a = (((long) (MarioAI.Hasher.hashSpeed(vx, MarioAI.Hasher.FACTOR_NUMBER_OF_SPEED_NODES))) << 32) | speedSign;
    final long edgeHash = edge.hashCode();
    return a | edgeHash;
}