public void loseScreen() {
    lose.update();
    if ((lose.giveNextScreen()) == (gamenum)) {
        reset(true);
        page = gamenum;
    }
}