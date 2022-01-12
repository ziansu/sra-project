public void onClick(org.bukkit.event.inventory.InventoryClickEvent event) {
    clickSubject.onNext(event);
    int slot = event.getRawSlot();
    if (((slot >= 0) && (slot < (size.getslots()))) && ((items[slot]) != null)) {
        items[slot].onItemClick(event);
    }
}