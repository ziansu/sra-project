public void register(org.bukkit.entity.Player player) {
    int toLevel = this._model.getDonationLevel(0);
    se.fredsfursten.donationboardplugin.PlayerInfo playerInfo = getOrAddPlayerInfo(player);
    playerInfo.demoteOrPromote(toLevel);
    this._knownPlayers.put(player, playerInfo);
    player.sendMessage(java.lang.String.format("You are currently at perk level %d.", (toLevel + 1)));
}