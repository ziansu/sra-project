public void setIsSharedInvOpen(java.lang.String name, boolean isSharedInvOpen) {
    be.spyproof.marriage.datamanager.PlayerData player = getPlayerData(name);
    if (player != null) {
        player.setIsSharedInvOpen(isSharedInvOpen);
        updatePlayerData(player);
    }
}