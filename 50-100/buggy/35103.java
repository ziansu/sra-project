public static boolean canCreate(org.bukkit.event.inventory.InventoryClickEvent e) {
    org.bukkit.inventory.ItemStack item = e.getCursor();
    if (0 == (e.getView().convertSlot(e.getRawSlot()))) {
        if (de.oninoni.OnionPower.Items.Batterod.check(item)) {
            return true;
        }
    }
    return false;
}