public static boolean validStanding() {
    for (int i = 0; i < (Client.players.length); i++) {
        if (Client.players[i].getStanding()) {
            return true;
        }
    }
    return false;
}