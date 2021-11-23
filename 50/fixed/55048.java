public void resetTablist() {
    this.clearAll();
    int i = 0;
    for (org.bukkit.entity.Player player : Bukkit.getOnlinePlayers()) {
        addExistingPlayer(i, player);
        i++;
    }
}