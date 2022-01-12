@java.lang.Override
public void init(org.bukkit.configuration.ConfigurationSection s) {
    cooldownTime = s.getLong("cooldown", 20);
    healthTrigger = s.getInt("healthTrigger", 4);
    useBed = s.getBoolean("useBed", true);
    inPlace = s.getBoolean("inPlace", true);
    permission = s.getString("permission", "");
    consumption = s.getInt("consumption", 0);
}