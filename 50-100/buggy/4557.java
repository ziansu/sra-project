public void doPush(level.action.PushAction action) {
    level.Location agLoc = action.getAgentLocation();
    level.Direction dir1 = action.getAgentDir();
    level.Direction dir2 = action.getBoxDir();
    level.Location nAgLoc = level.Location.newLocation(dir1, agLoc);
    level.Location nBoxLoc = level.Location.newLocation(dir2, nAgLoc);
    move(env.model.GridWorldModel.AGENT, agLoc, nAgLoc);
    move(env.model.GridWorldModel.BOX, nAgLoc, nBoxLoc);
}