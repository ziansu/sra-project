public static void init() {
    cpw.mods.fml.common.registry.GameRegistry.registerBlock(com.projectreddog.ecoshop.init.ModBlocks.BUYSHOP, Reference.BLOCK_BUYSHOP);
    cpw.mods.fml.common.registry.GameRegistry.registerTileEntity(com.projectreddog.ecoshop.tileentities.TileEntityBuyShop.class, Reference.BLOCK_BUYSHOP);
}