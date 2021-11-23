public void checkUserForBust(io.illcoder.casinoRoyale.core.Player user, io.illcoder.casinoRoyale.core.Player cpu) {
    if ((calcHandTotal(user)) > 21) {
        gameOver(user);
    }
}