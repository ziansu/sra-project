@java.lang.Override
public void run() {
    for (int i = 0; i < 9; i++) {
        if (i != (coreSlot))
            dispenser.getInventory().setItem(i, new org.bukkit.inventory.ItemStack(org.bukkit.Material.AIR));
        
    }
    dispenser.getInventory().setItem(((coreSlot) - 1), new org.bukkit.inventory.ItemStack(org.bukkit.Material.STAINED_GLASS_PANE));
    dispenser.getInventory().setItem(((coreSlot) + 1), new org.bukkit.inventory.ItemStack(org.bukkit.Material.STAINED_GLASS_PANE));
    reOpenInventories();
}