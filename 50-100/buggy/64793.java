public void setRegionBounds(final net.canarymod.api.world.World world, final int xMin, final int xMax, final int zMin, final int zMax) {
    addManagedWorld(world);
    final int[] points = com.goodformentertainment.canary.frontier.RegionUtil.pointsToArray(xMin, xMax, zMin, zMax);
    cfg.setIntArray(((com.goodformentertainment.canary.frontier.FrontierConfig.WORLD_FRONTIER) + (world.getFqName())), points);
    cfg.save();
}