@org.bukkit.event.EventHandler
public void entityPortalCreate(org.bukkit.event.entity.EntityCreatePortalEvent event) {
    if ((event.isCancelled()) || ((event.getBlocks().size()) == 0)) {
        return ;
    }
    com.onarandombox.MultiverseCore.api.MultiverseWorld world = this.plugin.getMVWorldManager().getMVWorld(event.getBlocks().get(0).getWorld());
    if (this.cancelPortalEvent(world, event.getPortalType())) {
        event.setCancelled(true);
    }
}