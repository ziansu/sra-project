public boolean setPlayerID(int runnerID) {
    if ((playersInGp.size()) < 8) {
        for (int i = 0; i < (tempLane); i++) {
            if ((playersInGp.get(i).getID()) == runnerID)
                return false;
            
        }
        playersInGp.add(((tempLane)++), new Event.Player(runnerID));
        return true;
    }
    return false;
}