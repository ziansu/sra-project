public static boolean isItemRecyleBlacklisted(net.minecraft.item.ItemStack item) {
    for (mal.lootbags.loot.LootItem loot : mal.lootbags.LootBags.LOOTMAP.recyclerBlacklist) {
        if (mal.lootbags.LootBags.areItemStacksEqualItem(loot.getContentItem().theItemId, item, true, false))
            return true;
        
    }
    return false;
}