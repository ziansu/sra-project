public boolean containsName(javafx.beans.property.StringProperty playerName) {
    for (int i = 0; i < (numPlayers); i++) {
        if (playerList[i].getName().equals(playerName)) {
            return true;
        }
    }
    return false;
}