@java.lang.Override
public java.lang.Double get() {
    org.bukkit.configuration.ConfigurationSection bals = balances();
    java.lang.String id = player.getUniqueId().toString();
    if (!(bals.contains(id))) {
        bals.set(id, defaultBalance);
        return defaultBalance;
    }else {
        return bals.getDouble(id);
    }
}