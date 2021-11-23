private void init(java.awt.Point initPos, com.gdx.AgentSystem.IMazeMap mazeMap) {
    com.gdx.AgentSystem.AgentGraph.GraphUnit graph = new com.gdx.AgentSystem.AgentGraph.GraphUnit(initPos);
    agentGraph = new com.gdx.AgentSystem.AgentGraph.AgentGraph(graph, this);
    map = mazeMap;
    nextPos = null;
    id = (com.gdx.AgentSystem.MazeAgent.next_id)++;
    com.gdx.AgentSystem.GlobalGraph.GlobalGraph globalGraph = com.gdx.AgentSystem.GlobalGraph.GlobalGraph.getInstance();
    com.gdx.AgentSystem.GlobalGraph.GlobalGraphUnit globalGraphUnit = new com.gdx.AgentSystem.GlobalGraph.GlobalGraphUnit(graph.getPos());
    graph.setGlobalGraphUnit(globalGraphUnit);
    globalGraph.addAgentToGlobalMap(id, graph.getGlobalGraphUnit());
    globalGraph.updateGlobalGraphUnit(id, globalGraphUnit);
}