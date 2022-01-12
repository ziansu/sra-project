public boolean explore(long startTime) {
    final delegateMAS.Route exploredRoute = virtualEnvironment.explore(agentID, getPosition(), destination.get(), startTime);
    pathContainsGoal = exploredRoute.containsDestination();
    path = new java.util.LinkedList(exploredRoute.getRoute());
    if ((path.size()) > 1) {
        path.removeFirst();
        return true;
    }
    return false;
}