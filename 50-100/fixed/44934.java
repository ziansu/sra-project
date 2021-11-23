public void saveIslandConfig(final java.lang.String location) {
    if ((islands.get(location)) == null) {
        return ;
    }
    java.io.File file = new java.io.File(this.directoryIslands, (location + ".yml"));
    try {
        getIslandConfig(location).save(file);
    } catch (java.io.IOException ex) {
        getLogger().log(java.util.logging.Level.SEVERE, ("Could not save config to " + file), ex);
    }
}