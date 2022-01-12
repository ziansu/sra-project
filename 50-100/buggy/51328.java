private static void registerItems(net.minecraftforge.fml.relauncher.Side side, net.minecraft.item.Item... items) {
    for (net.minecraft.item.Item item : items) {
        if (side == (net.minecraftforge.fml.relauncher.Side.CLIENT)) {
            net.minecraftforge.fml.common.registry.GameRegistry.register(item);
            net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation(item, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}