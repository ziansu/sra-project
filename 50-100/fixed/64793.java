public void setRegionBounds(final net.canarymod.api.world.World world, final int xMin, final int zMin, final int xMax, final int zMax) {
    addManagedWorld(world);
    final int[] points = new int[]{ xMin , zMin , xMax , zMax };
    cfg.setIntArray(((com.goodformentertainment.canary.frontier.FrontierConfig.WORLD_FRONTIER) + (world.getFqName())), points);
    cfg.save();
}