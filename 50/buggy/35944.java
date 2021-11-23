@java.lang.Override
public void run() {
    try {
        p.teleport(org.bukkit.Bukkit.getWorld("yomi").getSpawnLocation());
        addItem(p);
    } catch (java.lang.Exception ignored) {
    }
}