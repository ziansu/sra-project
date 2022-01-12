protected core.actions.Action BlockingES(dataContainer.Coordinate intruder) {
    java.util.Collection<dataContainer.Coordinate> otherAgents = lastSeen.getSpriteInVisionMap().keySet();
    otherAgents.remove(lastSeenThiefDirection);
    dataContainer.Coordinate next = core.Algorithms.BES.BES.getBlockingLocation(getCoordinates().clone(), otherAgents, intruder);
    return rTAStar(next);
}