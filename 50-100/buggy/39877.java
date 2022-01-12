private static void registerBlocks(net.minecraftforge.fml.relauncher.Side side, net.minecraft.block.Block... blocks) {
    for (net.minecraft.block.Block block : blocks) {
        final net.minecraft.item.ItemBlock itemBlock = new net.minecraft.item.ItemBlock(block);
        if (side == (net.minecraftforge.fml.relauncher.Side.CLIENT)) {
            net.minecraftforge.fml.common.registry.GameRegistry.register(block);
            net.minecraftforge.fml.common.registry.GameRegistry.register(itemBlock, block.getRegistryName());
            net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation(net.minecraft.item.Item.getItemFromBlock(block), 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(block.getRegistryName(), "inventory"));
        }
    }
}