public static boolean isPlotAreaAbs(final com.intellectualcrafters.plot.object.Location location) {
    final com.intellectualcrafters.plot.object.PlotWorld plotworld = com.intellectualcrafters.plot.PS.get().getPlotWorld(location.getWorld());
    if (plotworld == null) {
        return false;
    }
    if ((plotworld.TYPE) == 2) {
        return (com.intellectualcrafters.plot.util.ClusterManager.getClusterAbs(location)) != null;
    }
    return true;
}