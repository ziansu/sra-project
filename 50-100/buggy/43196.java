public java.util.List<org.bukkit.inventory.ItemStack> getItemStackList(java.lang.String path, java.lang.String def) {
    java.util.List<org.bukkit.inventory.ItemStack> items = new java.util.ArrayList<>();
    for (java.lang.String item : getStringList(path, def)) {
        if (co.neweden.gamesmanager.game.config.Parser.verifyItemStack(item)) {
            items.add(co.neweden.gamesmanager.game.config.Parser.parseItemStack(item));
        }
    }
    return items;
}