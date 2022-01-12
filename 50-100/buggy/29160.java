public void load(net.minecraft.util.ResourceLocation resourceLocation) {
    try {
        net.minecraft.client.resources.IResource res = net.minecraft.client.Minecraft.getMinecraft().getResourceManager().getResource(resourceLocation);
        load(res.getInputStream());
    } catch (java.io.IOException e) {
        MalisisCore.log.error("[ObjFileImporter] An error happened while reading the file : {}", e);
    }
}