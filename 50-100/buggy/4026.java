@java.lang.Override
public void dfs(com.epam.tutorial.graph.entity.Node startNode, com.epam.tutorial.graph.entity.Graph graph) {
    startNode.setVisited(true);
    visitedNodes.add(startNode);
    for (com.epam.tutorial.graph.entity.Link link : startNode.getChilds()) {
        if (!(visitedNodes.contains(link.getTarget()))) {
            dfs(link.getTarget(), graph);
        }
    }
}