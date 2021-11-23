private static net.minecraft.util.ResourceLocation nameToLocation(java.lang.String name) {
    name = name.substring(((name.indexOf("/")) + 1));
    java.lang.String domain = name.substring(0, name.indexOf("/"));
    java.lang.String path = name.substring(((name.indexOf("/")) + 1));
    com.elytradev.concrete.common.ConcreteLog.debug("Converted {} to {}", name, new net.minecraft.util.ResourceLocation(domain, path));
    return new net.minecraft.util.ResourceLocation(domain, path);
}