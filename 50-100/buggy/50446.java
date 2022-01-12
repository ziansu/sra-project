public static boolean isItemDroppable(net.minecraft.item.ItemStack item) {
    for (mal.lootbags.loot.LootItem loot : mal.lootbags.LootBags.LOOTMAP.recyclerWhitelist) {
        if (mal.lootbags.LootBags.areItemStacksEqualItem(loot.getContentItem().theItemId, item, false, false))
            return true;
        
    }
    for (mal.lootbags.loot.LootItem loot : mal.lootbags.LootBags.LOOTMAP.totalList.values()) {
        if (mal.lootbags.LootBags.areItemStacksEqualItem(loot.getContentItem().theItemId, item, false, false))
            return true;
        
    }
    return false;
}