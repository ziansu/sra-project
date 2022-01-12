public static org.terasology.input.Input getBindByUri(org.terasology.engine.SimpleUri uri) {
    org.terasology.config.Config config = org.terasology.registry.CoreRegistry.get(org.terasology.config.Config.class);
    org.terasology.config.BindsConfig bindConfig = config.getInput().getBinds();
    java.util.List<org.terasology.input.Input> binds = bindConfig.getBinds(uri);
    if (binds.isEmpty()) {
        return null;
    }
    return binds.get(0);
}