public void registerBlockModel() {
    net.minecraft.client.renderer.block.model.ModelResourceLocation typeLocation = new net.minecraft.client.renderer.block.model.ModelResourceLocation(getRegistryName(), "facing=east,half=bottom,shape=straight");
    net.minecraft.item.Item blockItem = net.minecraft.item.Item.getItemFromBlock(this);
    net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation(blockItem, 0, typeLocation);
}