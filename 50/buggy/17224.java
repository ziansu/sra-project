private static void registerBlockModel(net.minecraft.block.Block block) {
    net.minecraft.util.ResourceLocation resourceLocation = ((net.minecraft.util.ResourceLocation) (Block.blockRegistry.getNameForObject(block)));
    com.cricketcraft.chisel.client.ModelsChisel.registerBlockModel(block, 0, resourceLocation.getResourcePath());
}