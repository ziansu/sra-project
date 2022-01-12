public void addCulture(int playerIndex, int value) {
    if ((playerIndex >= 0) && (playerIndex < (org.openRealmOfStars.player.PlayerList.MAX_PLAYERS))) {
        culture[playerIndex] = (culture[playerIndex]) + value;
    }
}