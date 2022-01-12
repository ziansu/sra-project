public void removePlayer(final java.lang.String playerID) {
    int position = players.get(playerID).getPosition();
    players.remove(playerID);
    for (de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Field f : fields) {
        if ((f.getPlace().getPosition()) == position) {
            f.removePlayer(playerID);
        }
    }
}