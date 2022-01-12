@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    final java.nio.file.Path worldFolder = org.spongepowered.common.world.WorldManager.getCurrentSavesDirectory().get().resolve(props.getWorldName());
    if (!(java.nio.file.Files.exists(worldFolder))) {
        org.spongepowered.common.world.WorldManager.unregisterWorldProperties(this.props, true);
        return true;
    }
    try {
        org.apache.commons.io.FileUtils.deleteDirectory(worldFolder.toFile());
        org.spongepowered.common.world.WorldManager.unregisterWorldProperties(this.props, true);
        return true;
    } catch (java.io.IOException e) {
        return false;
    }
}