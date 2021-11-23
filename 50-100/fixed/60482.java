public static net.minecraft.util.ResourceLocation[] getResourceLocations(forestry.arboriculture.IWoodTyped typed) {
    java.util.List<net.minecraft.util.ResourceLocation> resourceLocations = new java.util.ArrayList<>();
    for (forestry.api.arboriculture.EnumWoodType woodType : typed.getWoodTypes()) {
        java.lang.String blockKind = typed.getBlockKind();
        net.minecraft.util.ResourceLocation resourceLocation = new forestry.core.render.ForestryResource(((blockKind + "/") + woodType));
        resourceLocations.add(resourceLocation);
    }
    return resourceLocations.toArray(new net.minecraft.util.ResourceLocation[resourceLocations.size()]);
}