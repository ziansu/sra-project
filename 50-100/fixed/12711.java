public static void reg(net.minecraft.block.Block block, int meta, java.lang.String file) {
    net.minecraft.item.Item item = net.minecraft.item.Item.getItemFromBlock(block);
    net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation(item, meta, new net.minecraft.client.resources.model.ModelResourceLocation((((io.github.zaphodious.essentialsorcery.core.Reference.MODID) + ":") + file), "inventory"));
    java.lang.System.out.println((((("Ran " + (io.github.zaphodious.essentialsorcery.core.Reference.MODID)) + ":") + (net.minecraft.item.Item.getItemFromBlock(block).getUnlocalizedName())) + " through the render reg."));
}