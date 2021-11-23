private final nl.weeaboo.vn.image.desc.IImageDefinition getImageDef(nl.weeaboo.filesystem.FilePath relPath) {
    if ((cachedImageDefs) == null) {
        try {
            nl.weeaboo.filesystem.FileSystemView fs = resourceLoader.getFileSystem();
            cachedImageDefs = com.google.common.collect.ImmutableMap.copyOf(nl.weeaboo.vn.image.impl.desc.ImageDefinitionIO.fromFileSystem(fs, nl.weeaboo.filesystem.FilePath.empty()));
        } catch (java.io.IOException e) {
            nl.weeaboo.vn.image.impl.TextureManager.LOG.warn("Error loading image definitions", e);
        }
    }
    return cachedImageDefs.get(relPath);
}