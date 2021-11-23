public void doMove(level.action.MoveAction action) {
    level.Direction dir = action.getDirection();
    level.Location agLoc = action.getAgentLocation();
    level.Location nAgLoc = level.Location.newLocation(dir, agLoc);
    move(env.model.GridWorldModel.AGENT, agLoc, nAgLoc);
}