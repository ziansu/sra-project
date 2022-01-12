@org.bukkit.event.EventHandler
public void onPlotFlagAdd(com.plotsquared.bukkit.events.PlotFlagAddEvent event) {
    if (event.getFlag().getName().equals("musicLink")) {
        for (com.intellectualcrafters.plot.object.PlotPlayer plotPlayer : event.getPlot().getPlayersInPlot()) {
            net.openaudiomc.actions.Command.stopRegion(plotPlayer.getName());
            net.openaudiomc.actions.Command.playRegion(plotPlayer.getName(), ((java.lang.String) (event.getPlot().getFlags().get(com.intellectualcrafters.plot.flag.FlagManager.getFlag("musicLink")))));
        }
    }
}