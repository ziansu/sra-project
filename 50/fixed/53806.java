public void checkUserForBust(io.illcoder.casinoRoyale.core.Player user) {
    if ((calcHandTotal(user)) > 21) {
        gameOver(user);
    }
}