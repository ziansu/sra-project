private java.util.Stack<edu.cwru.sepia.agent.AstarAgent.MapLocation> reconstructPath(edu.cwru.sepia.agent.AstarAgent.MapLocation start, edu.cwru.sepia.agent.AstarAgent.MapLocation end) {
    java.util.Stack<edu.cwru.sepia.agent.AstarAgent.MapLocation> toReturn = new java.util.Stack<edu.cwru.sepia.agent.AstarAgent.MapLocation>();
    edu.cwru.sepia.agent.AstarAgent.MapLocation current = end;
    while (!(current.equals(start))) {
        current = current.cameFrom;
        toReturn.push(current);
    } 
    toReturn.pop();
    return toReturn;
}