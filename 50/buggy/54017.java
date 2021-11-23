@java.lang.Override
public void reload() {
    varFileConfig = new io.github.wysohn.triggerreactor.misc.Utf8YamlConfiguration();
    try {
        varFileConfig.load(varFile);
    } catch (java.io.IOException | org.bukkit.configuration.InvalidConfigurationException e) {
        e.printStackTrace();
    }
}