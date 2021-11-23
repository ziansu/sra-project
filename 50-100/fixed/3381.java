private void setup() throws java.io.IOException {
    numberOfDays = getNumberOfDays();
    dayNumber = 1;
    int numPlayers = getNumberRequired("How many players?    ");
    playerList = new Player[numPlayers];
    for (int i = 0; i < numPlayers; i++) {
        playerList[i] = createPlayer();
    }
    generateFoodPrototypes();
}