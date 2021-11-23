public java.util.List<org.bukkit.inventory.ItemStack> getItemStackList(java.lang.String path, org.bukkit.inventory.ItemStack def) {
    java.util.List<org.bukkit.inventory.ItemStack> items = new java.util.ArrayList<>();
    for (java.lang.String item : getStringList(path, new java.util.ArrayList<java.lang.String>())) {
        if (co.neweden.gamesmanager.game.config.Parser.verifyItemStack(item)) {
            items.add(co.neweden.gamesmanager.game.config.Parser.parseItemStack(item));
        }
    }
    return items;
}