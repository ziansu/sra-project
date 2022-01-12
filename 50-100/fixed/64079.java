@org.bukkit.event.EventHandler
public void onEvent(org.bukkit.event.block.BlockBreakEvent event) {
    if (mp.getConfig().getStringList("track-placement").contains(event.getBlock().getType().name())) {
        this.generalListener(event, event.getPlayer().getName());
    }
}