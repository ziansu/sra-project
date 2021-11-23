@java.lang.Override
public void executeAction(int slot, org.bukkit.event.inventory.InventoryClickEvent event) {
    if ((slot == 45) && ((totalPages) > (page))) {
        backPage();
    }
    if ((slot == 53) && ((page) < (totalPages))) {
        forwardPage();
    }
}