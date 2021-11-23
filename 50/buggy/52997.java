public static tech.mcprison.prison.util.InventoryType prisonInventoryTypeToBukkit(tech.mcprison.prison.util.InventoryType type) {
    return tech.mcprison.prison.util.org.bukkit.event.inventory.InventoryType.valueOf(type.toString());
}