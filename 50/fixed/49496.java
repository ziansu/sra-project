public synchronized void setAllPlayersStand() {
    for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> playerStand : playersStand.entrySet()) {
        if (!(playerStand.getValue())) {
            allPlayersStand = false;
            return ;
        }
    }
    allPlayersStand = true;
}