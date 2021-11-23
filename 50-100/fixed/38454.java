public static java.lang.String getTextureIdentifier(net.minecraft.item.Item item) {
    java.lang.String identifier = item.getRegistryName().toString();
    if (identifier.contains(":")) {
        identifier = identifier.substring(((identifier.lastIndexOf(':')) + 1));
    }
    return "_" + identifier;
}