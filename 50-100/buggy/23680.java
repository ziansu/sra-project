public void createPlayers() {
    sample.Player[] listOfPlayers = new sample.Player[2];
    listOfPlayers[0] = sample.PlayerList.newPlayer(Left_index, Player.LEFT_SIDE);
    listOfPlayers[1] = sample.PlayerList.newPlayer(Right_index, Player.RIGHT_SIDE);
    listOfPlayers[0].createAnimal(0);
    listOfPlayers[1].createAnimal(1);
}