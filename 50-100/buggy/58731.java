private static boolean isClosestToIntruder(dataContainer.Coordinate agent, java.util.Collection<dataContainer.Coordinate> otherAgents, dataContainer.Coordinate intruder) {
    for (dataContainer.Coordinate otherAgent : otherAgents) {
        if ((otherAgent.distance(intruder)) > (agent.distance(intruder)))
            return false;
        
    }
    return true;
}