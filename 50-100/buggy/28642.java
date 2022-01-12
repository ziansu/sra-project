private synchronized net.bhl.cdt.paxelerate.model.astar.Path reconstructPath(net.bhl.cdt.paxelerate.model.astar.Node node) {
    net.bhl.cdt.paxelerate.model.astar.Path path = new net.bhl.cdt.paxelerate.model.astar.Path();
    while (((node.getPreviousNode()) != null) && (node != null)) {
        path.prependWayPoint(node);
        node = node.getPreviousNode();
    } 
    return path;
}