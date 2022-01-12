public synchronized boolean canMove(level.action.MoveAction action) {
    level.Direction dir = action.getDirection();
    level.Location agLoc = action.getAgentLocation();
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