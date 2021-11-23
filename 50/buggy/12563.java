@java.lang.Override
public void configure() {
    pluginManager.getPluginConfiguration().setConfiguration(com.constellio.model.entities.modules.ConstellioPlugin.class, "singletonInitializeMode", "true");
}