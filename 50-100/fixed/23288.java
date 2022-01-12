public traveller.subsector.Subsector getJumpWorlds(traveller.subsector.Location worldLoc, int jumpNumber) {
    traveller.subsector.Location[] locs = getJumpWorldsLocations(worldLoc, jumpNumber);
    traveller.subsector.Subsector worldList = new traveller.subsector.Subsector();
    for (traveller.subsector.Location loc : locs) {
        worldList.addWorld(loc, worlds.get(loc));
    }
    return worldList;
}