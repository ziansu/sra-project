public void update(org.newdawn.slick.GameContainer gc, int i) throws org.newdawn.slick.SlickException {
    diceButton.update(gc, i);
    if ((diceButton.buttonDiceControl) == true) {
        if ((once) < 1) {
            writeDiceToConsole();
            (once)++;
            diceButton.buttonDiceControl = false;
        }
    }
}