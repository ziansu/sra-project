public boolean isActionPossible(org.worldgrower.WorldObject performer, org.worldgrower.World world) {
    return managedOperation.isActionPossible(performer, target, args, world);
}