@java.lang.Override
public void onDisable() {
    for (org.bukkit.entity.Player p : getServer().getOnlinePlayers()) {
        UserManager.INSTANCE.saveUser(p.getUniqueId());
    }
}