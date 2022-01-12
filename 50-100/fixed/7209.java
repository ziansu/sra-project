@java.lang.Override
public void positionModifierChange(int[] oldP, int[] newP, boolean topDown, int positiv, boolean gameWon) {
    this.gameWon = gameWon;
    if (((oldP[0]) != (newP[0])) || ((oldP[1]) != (newP[1]))) {
        positionChanged = true;
        playerOld = oldP;
        playerNew = newP;
        this.topDown = topDown;
        this.positiv = positiv;
    }
}