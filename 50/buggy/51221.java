public boolean isBlue(org.bukkit.entity.Player player, java.lang.String GameID) {
    SmackemSilly.GameAPI game = this.getGame(GameID);
    if (game.getBluePlayers().contains(player)) {
        return true;
    }
    return false;
}