private float getFromConfig(java.lang.String path) {
    ch.batthomas.surf.util.ConfigHelper config = worlds.get(currentWorld);
    return java.lang.Float.parseFloat(config.getConfig().getString(path));
}