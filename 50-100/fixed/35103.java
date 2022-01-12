public static boolean canCreate(org.bukkit.event.inventory.InventoryClickEvent e) {
    org.bukkit.inventory.ItemStack item = e.getCursor();
    return (1 == (e.getView().convertSlot(e.getRawSlot()))) && (de.oninoni.OnionPower.Items.Batterod.check(item));
}