public synchronized java.lang.String join(severalClientProject.MiniServer player) {
    int slot = getNextEmptySlot();
    if (slot >= 0) {
        java.lang.String errorMsg = checkIfPlayerBanned(player.getClientName());
        if (errorMsg.equals("")) {
            players[slot] = player;
            (this.numPlayers)++;
            renewRefreshMessage();
            return "";
        }else {
            return errorMsg;
        }
    }else {
        return "ERROR: couldn\'t find an empty slot!";
    }
}