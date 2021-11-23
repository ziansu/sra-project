@org.bukkit.event.EventHandler
public void onBlockPhysics(org.bukkit.event.block.BlockPhysicsEvent e) {
    @java.lang.SuppressWarnings(value = "deprecation")
    int typeID = e.getBlock().getTypeId();
    if (((typeID == 124) || (typeID == 27)) && (!(this.plugin.isRedstoneMaterial(e.getChangedType())))) {
        e.setCancelled(true);
    }
}