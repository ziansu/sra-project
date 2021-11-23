private static com.worldciv.filesystem.CustomItem createItemFromYAML(org.bukkit.configuration.file.YamlConfiguration yaml) {
    com.worldciv.filesystem.CustomItem item = new com.worldciv.filesystem.CustomItem(yaml.getItemStack("Item-Data.ItemStack"), yaml.getString("Item-Data.Name"), yaml.getString("Item-Data.UUID"), yaml.getInt("Item-Data.Damage"), yaml.getInt("Item-Data.Armor"), Rarity.Common, Tier.I);
    return item;
}