@java.lang.Override
public void save(final org.bukkit.configuration.ConfigurationSection config, final java.lang.String path) {
    room.save(config, (path + "room."), true);
}