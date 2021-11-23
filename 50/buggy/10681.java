@java.lang.Override
public boolean exists() {
    if ((org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(file)) == null) {
        return false;
    }else
        return true;
    
}