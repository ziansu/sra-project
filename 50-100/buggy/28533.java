private void addLootTableEntryInternal(java.lang.String tableName, int weightIn, int qualityIn, net.minecraft.world.storage.loot.conditions.LootCondition[] conditions, java.lang.String name) {
    if (name == null) {
        name = tableName + "-lt";
        int counter = 1;
        while ((backingPool.getEntry(name)) != null) {
            name = (tableName + "-lt#") + (++counter);
        } 
    }
    leviathan143.loottweaker.common.zenscript.MineTweakerAPI.apply(new leviathan143.loottweaker.common.zenscript.ZenLootPoolWrapper.AddLootEntry(this, new leviathan143.loottweaker.common.zenscript.LootEntryTable(new net.minecraft.util.ResourceLocation(tableName), weightIn, qualityIn, conditions, name)));
}