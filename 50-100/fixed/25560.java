public void startNewGame() {
    shouldUpdateGame = true;
    g = new thepianogame.models.Game(this, gameScreenView);
    g.setCarModel(carModel);
    if ((timer) == null) {
        timer = new javax.swing.Timer(((int) (1000 / 60)), this);
    }
    timer.start();
}