private void registerListeners() {
    pm.registerEvents(new pointshop.listeners.inventory.InventoryClick(this), this);
    pm.registerEvents(new pointshop.listeners.player.PlayerJoin(this), this);
    pm.registerEvents(new pointshop.commands.ShopCmd(null), this);
    pm.registerEvents(new pointshop.listeners.entity.EntityDeath(), this);
}