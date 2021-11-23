public void addPowerUp() {
    int yPos = 0;
    int berryH = 60;
    int berryW = 60;
    game.miniGameTeam.PowerUp powerUpImage = new game.miniGameTeam.PowerUp(randomX(), yPos, berryH, berryW, this);
    powerUpImage.play();
    if (((count) % 20) == 0) {
        game.miniGameTeam.GameScreen.powerUpArray.add(powerUpImage);
        addObject(powerUpImage);
    }
}