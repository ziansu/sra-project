public void setup(java.lang.String levelName) {
    agent = new MarioAI.FastAndFurious();
    observation = tests.TestTools.loadLevel((levelName + ".lvl"), agent);
    tests.TestTools.runOneTick(observation);
    graph = new MarioAI.graph.nodes.World();
    graph.initialize(observation);
    new MarioAI.graph.edges.EdgeCreator().setMovementEdges(graph, graph.getMarioNode(observation));
}