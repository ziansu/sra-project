@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST, ignoreCancelled = true)
public void onBlockFromTo(org.bukkit.event.block.BlockFromToEvent event) {
    org.bukkit.block.Block block = event.getToBlock();
    org.mctourney.autoreferee.AutoRefMatch match = plugin.getMatch(block.getWorld());
    if ((match != null) && (match.hasFlag(block.getLocation().add(0.0, 0.0, 0.5), AutoRefRegion.Flag.NO_FLOW))) {
        event.setCancelled(true);
    }
}