@java.lang.Override
public void onClick(org.bukkit.event.inventory.InventoryClickEvent event) {
    org.bukkit.entity.Player player = ((org.bukkit.entity.Player) (event.getWhoClicked()));
    if (player != null) {
        player.performCommand(("vote reward " + (voteSite.getSiteName())));
        player.closeInventory();
    }
}