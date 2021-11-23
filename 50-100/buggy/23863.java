private static void registerItemModel(net.minecraft.item.Item item, int meta, java.lang.String resourcePath) {
    net.minecraft.client.resources.model.ModelResourceLocation modelResourceLocation = new net.minecraft.client.resources.model.ModelResourceLocation(com.cricketcraft.chisel.client.ModelsChisel.getResource(resourcePath), "inventory");
    net.minecraft.client.Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, modelResourceLocation);
}