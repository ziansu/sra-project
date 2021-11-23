private java.util.Stack<edu.cwru.sepia.agent.minimax.AstarAgent.MapLocation> reconstructPath(edu.cwru.sepia.agent.minimax.AstarAgent.MapLocation current, edu.cwru.sepia.agent.minimax.AstarAgent.MapLocation start) {
    java.util.Stack<edu.cwru.sepia.agent.minimax.AstarAgent.MapLocation> path = new java.util.Stack<edu.cwru.sepia.agent.minimax.AstarAgent.MapLocation>();
    path.add(current);
    java.lang.System.out.println(current.cameFrom);
    while (!(current.cameFrom.equals(start))) {
        current = current.cameFrom;
        path.add(current);
    } 
    return path;
}