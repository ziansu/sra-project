public void build(org.bukkit.inventory.InventoryHolder owner) {
    if ((slots.length) > (inventoryType.getDefaultSize())) {
        inventory = plugin.getServer().createInventory(null, slots.length, title);
    }else {
        inventory = plugin.getServer().createInventory(null, inventoryType, title);
    }
    setOwner(owner);
    registerListeners();
}