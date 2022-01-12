@java.lang.Override
public boolean isShopInventory(org.bukkit.inventory.Inventory inventory, org.bukkit.entity.Player owner) {
    return inventory.getTitle().contains("Bank");
}