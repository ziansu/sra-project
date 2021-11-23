public synchronized void updateNames(java.util.Collection<Deliquescence.Player> players) {
    for (Deliquescence.Player newPlayer : players) {
        boolean addable = true;
        for (Deliquescence.Player cPlayer : allPlayers) {
            if (newPlayer.equals(cPlayer)) {
                addable = false;
                allPlayers.remove(cPlayer);
                allPlayers.add(newPlayer);
                break;
            }
        }
        if (addable) {
            allPlayers.add(newPlayer);
        }
    }
    com.esotericsoftware.minlog.Log.trace("client", "Client updated names");
}