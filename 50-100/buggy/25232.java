public MarioAI.graph.nodes.SpeedNode getSpeedNode(MarioAI.graph.edges.DirectedEdge neighborEdge, MarioAI.graph.nodes.SpeedNode current) {
    final long hash = MarioAI.Hasher.hashSpeedNode(current.vx, neighborEdge);
    final MarioAI.graph.nodes.SpeedNode speedNode = speedNodes.get(hash);
    if (speedNode != null) {
    }
    final MarioAI.graph.nodes.SpeedNode newSpeedNode = new MarioAI.graph.nodes.SpeedNode(neighborEdge.target, current, neighborEdge, hash);
    speedNodes.put(hash, newSpeedNode);
    return newSpeedNode;
}