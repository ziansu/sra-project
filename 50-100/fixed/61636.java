public void registerModel() {
    net.minecraft.client.renderer.RenderItem renderItem = net.minecraft.client.Minecraft.getMinecraft().getRenderItem();
    java.lang.String location = ((SuperDopeJediMod.MODID) + ":") + (((superdopesquad.superdopejedimod.BaseBlock) (this)).getName());
    renderItem.getItemModelMesher().register(net.minecraft.item.Item.getItemFromBlock(this), 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(location));
}