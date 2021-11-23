public void loseScreen() {
    lose.update();
    page = lose.giveNextScreen();
    if ((page) == (gamenum)) {
        reset(true);
    }
}