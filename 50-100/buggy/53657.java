public static org.bukkit.entity.Player getRandomPlayer() {
    int random = new java.util.Random().nextInt(org.bukkit.Bukkit.getOnlinePlayers().size());
    return ((org.bukkit.entity.Player) (org.bukkit.Bukkit.getServer().getOnlinePlayers().toArray()[random]));
}