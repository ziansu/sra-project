public void doPull(level.action.PullAction action) {
    level.Location agLoc = action.getAgentLocation();
    level.Direction dir1 = action.getAgentDir();
    level.Direction dir2 = action.getBoxDir();
    level.Location boxLoc = level.Location.newLocation(dir2, agLoc);
    level.Location nAgLoc = level.Location.newLocation(dir1, agLoc);
    move(env.model.GridWorldModel.AGENT, agLoc, nAgLoc);
    move(env.model.GridWorldModel.BOX, boxLoc, agLoc);
}