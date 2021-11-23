public void build(org.bukkit.inventory.InventoryHolder owner) {
    if ((slots.length) > (inventoryType.getDefaultSize())) {
        inventory = plugin.getServer().createInventory(owner, slots.length, title);
    }else {
        inventory = plugin.getServer().createInventory(owner, inventoryType, title);
    }
    setOwner(owner);
    registerListeners();
}