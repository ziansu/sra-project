private se.fredsfursten.donationboardplugin.PlayerInfo getOrAddPlayerInfo(org.bukkit.entity.Player player) {
    se.fredsfursten.donationboardplugin.PlayerInfo playerInfo = this._knownPlayers.get(player);
    if (playerInfo == null) {
        playerInfo = new se.fredsfursten.donationboardplugin.PlayerInfo(player);
        this._knownPlayers.put(player, playerInfo);
        int toLevel = this._model.getDonationLevel(0);
        playerInfo.demoteOrPromote(toLevel);
    }
    return playerInfo;
}