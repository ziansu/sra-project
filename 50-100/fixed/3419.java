private static void registerFluidBlock(net.minecraftforge.fluids.BlockFluidClassic block, java.lang.String identifier) {
    final net.minecraft.client.renderer.block.model.ModelResourceLocation mrl = new net.minecraft.client.renderer.block.model.ModelResourceLocation(new net.minecraft.util.ResourceLocation(com.mhfs.capacitors.BigCapacitorsMod.modid, com.mhfs.capacitors.render.ItemRenderHelper.fluidStateModel), identifier);
    net.minecraftforge.client.model.ModelLoader.setCustomStateMapper(block, new net.minecraft.client.renderer.block.statemap.StateMapperBase() {
        protected net.minecraft.client.renderer.block.model.ModelResourceLocation getModelResourceLocation(net.minecraft.block.state.IBlockState state) {
            return mrl;
        }
    });
}