public void savePlayerState(org.bukkit.entity.Player player, java.lang.String group) {
    uk.co.tggl.pluckerpluck.multiinv.player.MIPlayer miPlayer = uk.co.tggl.pluckerpluck.multiinv.listener.MIPlayerListener.players.get(player);
    miPlayer.saveInventory(group, player.getGameMode().toString());
    miPlayer.saveHealth(group);
    miPlayer.saveHunger(group);
    miPlayer.saveGameMode(group);
    miPlayer.saveExperience(group);
}