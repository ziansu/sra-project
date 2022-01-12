private static void registerFluidBlock(net.minecraftforge.fluids.BlockFluidClassic block, java.lang.String identifier) {
    net.minecraft.item.Item item = net.minecraft.item.Item.getItemFromBlock(block);
    final net.minecraft.client.renderer.block.model.ModelResourceLocation mrl = new net.minecraft.client.renderer.block.model.ModelResourceLocation(new net.minecraft.util.ResourceLocation(com.mhfs.capacitors.BigCapacitorsMod.modid, com.mhfs.capacitors.render.ItemRenderHelper.fluidStateModel), identifier);
    net.minecraft.client.renderer.block.model.ModelBakery.registerItemVariants(item);
    net.minecraftforge.client.model.ModelLoader.setCustomMeshDefinition(item, new net.minecraft.client.renderer.ItemMeshDefinition() {
        public net.minecraft.client.renderer.block.model.ModelResourceLocation getModelLocation(net.minecraft.item.ItemStack stack) {
            return mrl;
        }
    });
    net.minecraftforge.client.model.ModelLoader.setCustomStateMapper(block, new net.minecraft.client.renderer.block.statemap.StateMapperBase() {
        protected net.minecraft.client.renderer.block.model.ModelResourceLocation getModelResourceLocation(net.minecraft.block.state.IBlockState state) {
            return mrl;
        }
    });
}