private static void setupChestLoot() {
    if ((mcjty.rftools.blocks.dimlets.DimletConfiguration.unknownDimletChestLootRarity) > 0) {
        mcjty.rftools.items.dimlets.KnownDimletConfiguration.setupChestLoot(ChestGenHooks.DUNGEON_CHEST);
        mcjty.rftools.items.dimlets.KnownDimletConfiguration.setupChestLoot(ChestGenHooks.MINESHAFT_CORRIDOR);
        mcjty.rftools.items.dimlets.KnownDimletConfiguration.setupChestLoot(ChestGenHooks.PYRAMID_DESERT_CHEST);
        mcjty.rftools.items.dimlets.KnownDimletConfiguration.setupChestLoot(ChestGenHooks.PYRAMID_JUNGLE_CHEST);
        mcjty.rftools.items.dimlets.KnownDimletConfiguration.setupChestLoot(ChestGenHooks.STRONGHOLD_CORRIDOR);
        mcjty.rftools.items.dimlets.KnownDimletConfiguration.setupChestLoot(ChestGenHooks.VILLAGE_BLACKSMITH);
    }
}