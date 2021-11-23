public static boolean has(org.bukkit.inventory.Inventory inventory, org.bukkit.inventory.ItemStack itemStack, com.jcwhatever.nucleus.utils.items.ItemStackComparer comparer, int qty) {
    return (com.jcwhatever.nucleus.utils.inventory.InventoryUtils.count(inventory, itemStack, comparer, qty)) == qty;
}