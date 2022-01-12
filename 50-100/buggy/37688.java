public void rotate(char q, boolean r) {
    if (((getCurrentPlayer().getRotated()) == false) && ((getCurrentPlayer().getPlaced()) == true)) {
        b.rotate(q, r);
    }
    getCurrentPlayer().setRotated(true);
    game.upCheck();
}