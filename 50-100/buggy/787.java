public void randomPlay() {
    int x;
    int y;
    while (true) {
        x = battleship.service.RandomNumber.getRandom(Constants.GRID_SIZE);
        y = battleship.service.RandomNumber.getRandom(Constants.GRID_SIZE);
        if (!(player.hasBeenShot(x, y))) {
            player.shoot(x, y);
            player.printGrid(true);
            player.getBoatSunk();
        }
        if (player.getWinner()) {
            break;
        }
    } 
}