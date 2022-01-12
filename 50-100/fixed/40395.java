@java.lang.Override
public de.craftolution.craftoplugin4.services.config.ConfigSection setLocation(final java.lang.String path, final org.bukkit.Location value) {
    this.getOrCreateSection(path).setDouble("x", value.getX()).setDouble("y", value.getY()).setDouble("z", value.getZ()).setWorld("world", value.getWorld()).setFloat("yaw", value.getYaw()).setFloat("pitch", value.getPitch());
    return this;
}