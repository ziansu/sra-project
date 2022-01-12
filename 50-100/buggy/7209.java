@java.lang.Override
public void positionModifierChange(int[] oldP, int[] newP, boolean topDown, int positiv, boolean gameWon) {
    this.gameWon = gameWon;
    positionChanged = true;
    playerOld = oldP;
    playerNew = newP;
    this.topDown = topDown;
    this.positiv = positiv;
}