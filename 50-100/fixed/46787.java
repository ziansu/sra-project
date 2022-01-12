public int getNextTeam() {
    int noOfBlue = 0;
    int noOfRed = 0;
    synchronized(listOfPlayers) {
        for (Server.Creatures.ServerPlayer player : listOfPlayers) {
            if ((player.getTeam()) == (Server.Creatures.ServerCreature.RED_TEAM)) {
                noOfRed++;
            }else {
                noOfBlue++;
            }
        }
    }
    if (noOfBlue == noOfRed) {
        if ((java.lang.Math.random()) < 0.5) {
            return Server.Creatures.ServerCreature.BLUE_TEAM;
        }
        return Server.Creatures.ServerCreature.RED_TEAM;
    }else
        if (noOfBlue > noOfRed) {
            return Server.Creatures.ServerCreature.RED_TEAM;
        }
    
    return Server.Creatures.ServerCreature.BLUE_TEAM;
}