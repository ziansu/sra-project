private void registerListeners() {
    pm.registerEvents(new pointshop.listeners.inventory.InventoryClick(this), this);
    pm.registerEvents(new pointshop.listeners.player.PlayerJoin(this), this);
    pm.registerEvents(new pointshop.commands.ShopCmd(), this);
    pm.registerEvents(new pointshop.listeners.entity.EntityDeath(), this);
}