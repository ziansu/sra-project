public static de.unitygaming.bukkit.vsign.Version getCurrent() {
    if ((de.unitygaming.bukkit.vsign.Version.current) == null) {
        de.unitygaming.bukkit.vsign.Version.current = de.unitygaming.bukkit.vsign.Version.fromString(((org.bukkit.Bukkit.getServer().getClass().getPackage().getName().substring(23)) + "."));
    }
    return de.unitygaming.bukkit.vsign.Version.current;
}