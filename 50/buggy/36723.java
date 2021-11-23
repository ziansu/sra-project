private static net.minecraft.block.Block registerBlockCrop(java.lang.String registerName) {
    final net.minecraft.block.Block pamCrop = new com.pam.harvestcraft.blocks.BlockPamCrop();
    final net.minecraft.item.ItemBlock itemBlock = new com.pam.harvestcraft.blocks.ItemBlockFruit(pamCrop);
    return com.pam.harvestcraft.blocks.BlockRegistry.registerBlock(registerName, itemBlock, pamCrop);
}