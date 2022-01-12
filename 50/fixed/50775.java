private static void drop(org.bukkit.Location where, org.bukkit.inventory.Inventory container, boolean naturally) {
    for (org.bukkit.inventory.ItemStack item : container.getContents()) {
        if (item == null)
            continue;
        
        com.gmail.zariust.otherdrops.drop.ContentsDrop.drop(where, item, naturally);
    }
}