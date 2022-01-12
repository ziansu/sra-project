public static void RegisterModComponents() {
    com.wuest.prefab.ModRegistry.registerItem(new com.wuest.prefab.ItemStartHouse("itemStartHouse"));
    com.wuest.prefab.BlockCompressedStone stone = new com.wuest.prefab.BlockCompressedStone();
    com.wuest.prefab.ItemBlockMeta meta = new com.wuest.prefab.ItemBlockMeta(stone);
    com.wuest.prefab.ModRegistry.setItemName(meta, "blockCompressedStone");
    com.wuest.prefab.ModRegistry.registerBlock(stone, meta);
}