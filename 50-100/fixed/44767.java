@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void onWorldUnload(org.bukkit.event.world.WorldUnloadEvent event) {
    if (event.isCancelled())
        return ;
    
    for (me.eddiep.handles.ClassicPhysicsHandler.LogicContainerHolder holder : logicContainers)
        holder.container.unloadFor(event.getWorld());
    
    this.toFroms.clear();
    this.chunks.clear();
    if (running)
        running = false;
    
    for (org.bukkit.Location l : metaDataLocations)
        if (l.getBlock().hasMetadata("classic_block"))
            l.getBlock().removeMetadata("classic_block", ClassicPhysics.INSTANCE);
        
    
    metaDataLocations.clear();
}