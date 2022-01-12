public void show(org.bukkit.entity.Player player) {
    this.player = player;
    org.bukkit.inventory.Inventory inventory = player.getOpenInventory().getTopInventory();
    if (!(inventory instanceof org.bukkit.inventory.CraftingInventory)) {
        de.syscy.kagegui.KageGUI.removeCraftingGUI(player);
        return ;
    }
    bukkitInventory = ((org.bukkit.inventory.CraftingInventory) (inventory));
    inventoryWrapper = new de.syscy.kagegui.crafting.KCraftingInventoryWrapper(this, bukkitInventory);
}