public void spawnItem(me.lukas81298.flexmc.world.Location location, org.bukkit.inventory.ItemStack itemStack) {
    me.lukas81298.flexmc.entity.FlexItem item = new me.lukas81298.flexmc.entity.FlexItem(nextEntityId(), location, this);
    item.setItemStack(itemStack);
    if (!(me.lukas81298.flexmc.util.EventFactory.call(new org.bukkit.event.entity.ItemSpawnEvent(item, location)).isCancelled())) {
        this.addEntity(item, false);
    }
}