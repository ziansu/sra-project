public void registerVarients() {
    net.minecraft.util.ResourceLocation[] varientNames = new net.minecraft.util.ResourceLocation[metadataNames.length];
    for (int i = 0; i < (varientNames.length); i++) {
        varientNames[i] = new net.minecraft.util.ResourceLocation(me.kk47.modeltrains.Data.MODID, ((this.getUnlocalizedName().substring(5)) + (metadataNames[i])));
    }
    net.minecraft.client.renderer.block.model.ModelBakery.registerItemVariants(ModItems.trackStraight, varientNames);
}