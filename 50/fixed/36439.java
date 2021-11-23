@Optional.Method(modid = "Railcraft")
public net.minecraft.util.ResourceLocation getEmblemIcon() {
    java.lang.String id = this.dataWatcher.getWatchableObjectString(5);
    if ((id == null) || ((id.length()) < 1))
        return null;
    
    return EmblemToolsClient.packageManager.getEmblemTextureLocation(id);
}