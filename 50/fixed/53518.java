public boolean isInGame(org.bukkit.entity.Player player) {
    for (SmackemSilly.GameAPI game : this.games) {
        if (game.getPlayers().contains(player.getName())) {
            return true;
        }
    }
    return false;
}