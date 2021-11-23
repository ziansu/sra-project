public void addPlayer(org.bukkit.entity.Player player) {
    this.users.add(player);
    if ((this.users.size()) >= (this.dungeon)) {
        this.accessible = false;
    }
}