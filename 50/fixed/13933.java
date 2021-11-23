public com.worldcretornica.plotme_core.api.Location getPlotHome(com.worldcretornica.plotme_core.PlotId id, com.worldcretornica.plotme_core.api.IWorld world) {
    return getGenManager(world).getPlotHome(id);
}