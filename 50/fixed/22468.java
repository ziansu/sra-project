private java.lang.String getPath(net.minecraft.util.ResourceLocation location) {
    return java.lang.String.format("assets/%s/%s", location.getResourceDomain(), location.getResourcePath()).toLowerCase();
}