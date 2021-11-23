public static void reg(net.minecraft.block.Block block) {
    net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation(net.minecraft.item.Item.getItemFromBlock(block), 0, new net.minecraft.client.resources.model.ModelResourceLocation(new net.minecraft.util.ResourceLocation(com.github.wolfiewaffle.hardcoretorches.HardcoreTorches.MODID, block.getRegistryName()), "inventory"));
}