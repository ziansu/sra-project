private void setupConfigFolders() {
    java.io.File pluginsFolder = getDataFolder().getParentFile();
    java.io.File coreFolder = new java.io.File(pluginsFolder, "PlotMe");
    configFolder = new java.io.File(coreFolder, getName());
    configFolder.mkdirs();
}