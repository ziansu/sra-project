private java.util.Stack<edu.cwru.sepia.agent.minimax.AstarAgent.MapLocation> reconstructPath(edu.cwru.sepia.agent.minimax.AstarAgent.MapLocation current, edu.cwru.sepia.agent.minimax.AstarAgent.MapLocation start) {
    java.util.Stack<edu.cwru.sepia.agent.minimax.AstarAgent.MapLocation> path = new java.util.Stack<edu.cwru.sepia.agent.minimax.AstarAgent.MapLocation>();
    path.add(current);
    if ((current.cameFrom) == null) {
        return path;
    }
    while (!(current.cameFrom.equals(start))) {
        current = current.cameFrom;
        path.add(current);
    } 
    return path;
}