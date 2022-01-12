public boolean exists(core.world.WorldResource resource) {
    final int count = getInstanceCount(resource);
    return count == 1;
}