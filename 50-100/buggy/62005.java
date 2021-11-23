@java.lang.Override
public java.util.List<srch.Node> getExpandedNodes() {
    java.util.List<srch.Node> expandedNodes = new java.util.ArrayList<srch.Node>();
    for (level.action.Action action : level.action.Action.Every(model.getAgentLocation())) {
        if (env.planner.Planner.getModel(this.getStep()).canExecute(action)) {
            expandedNodes.add(new srch.nodes.PathfindingNode(this, action, model.run(action)));
        }
    }
    return expandedNodes;
}