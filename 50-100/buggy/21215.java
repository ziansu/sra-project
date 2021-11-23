private org.bukkit.inventory.ItemStack getItemStack(java.lang.String id) {
    org.bukkit.configuration.file.YamlConfiguration config = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(main.getConfigManager().getConfig("SignId.yml"));
    org.bukkit.inventory.ItemStack is = config.getItemStack((id + ".ItemStack"));
    is.setAmount(1);
    return is;
}