@java.lang.Override
public net.minecraft.client.resources.model.ModelResourceLocation getModelLocation(net.minecraft.item.ItemStack stack) {
    int meta = stack.getMetadata();
    forestry.api.arboriculture.EnumWoodType woodType = wood.getWoodType(meta);
    java.lang.String blockKind = wood.getBlockKind();
    return forestry.core.models.ModelManager.getInstance().getModelLocation(((blockKind + "/") + woodType));
}