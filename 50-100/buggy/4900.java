public org.bukkit.inventory.ItemStack getLore(java.lang.String name, org.bukkit.entity.Player player) {
    org.bukkit.inventory.ItemStack tmp = null;
    if (!(isLoreRegistered(name))) {
        player.sendMessage(((org.bukkit.ChatColor.RED) + "That lore can not be found!"));
        return tmp;
    }else {
        tmp = df.getData().getItemStack(("lores." + name));
        return tmp;
    }
}