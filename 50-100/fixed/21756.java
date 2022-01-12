@java.lang.Override
public void save(final org.bukkit.configuration.ConfigurationSection config, final java.lang.String path) {
    int i = 0;
    config.set((path + "rooms"), null);
    for (final de.st_ddt.crazyutil.poly.room.Room room : rooms) {
        room.save(config, (((path + "rooms.room") + (i++)) + "."), true);
    }
}