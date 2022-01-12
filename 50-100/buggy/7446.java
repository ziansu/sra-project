public synchronized boolean canMove(level.action.MoveAction action) {
    level.Location agLoc = action.getAgentLocation();
    level.Direction dir = action.getDirection();
    if (agLoc == null) {
        return false;
    }
    level.Location nAgLoc = level.Location.newLocation(dir, agLoc);
    if (nAgLoc == null) {
        return false;
    }
    if (!(isFree(nAgLoc))) {
        return false;
    }
    return true;
}