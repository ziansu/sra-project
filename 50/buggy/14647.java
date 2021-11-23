public boolean canExecuteIgnoringDistance(org.worldgrower.WorldObject performer, org.worldgrower.World world) {
    return ((isValidTarget(world)) && (managedOperation.isActionPossible(performer, target, args, world))) && (performer.canWorldObjectPerformAction(managedOperation));
}